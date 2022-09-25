package com.jchimbo.proyecto.util.validation;

import com.jchimbo.proyecto.entity.Persona;
import com.jchimbo.proyecto.util.exception.RequestException;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.http.HttpStatus;

/**
 *
 * @author Javier Chimbo
 */
public class ValidationPerson {

    public ValidationPerson() {
    }

    /**
     * Metodo para controlar las validaciones en la peticion del GET En el caso
     * de que no exista el ID lanza una exception
     *
     * @param exist
     */
    public void ValidationExistFalse(boolean exist) {
        if (!exist) {
            throw new RequestException("La persona no existe", "p-1", HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Metodo para controlar las validaciones en la peticion del POST En el caso
     * de que exista el ID lanza una exception
     *
     * @param exist
     * @param persona
     */
    public void ValidationExistTrue(boolean exist, Persona persona) {
        if (exist) {
            throw new RequestException("Ya existe el numero de cedula", "p-3", HttpStatus.BAD_REQUEST);
        } else {
            ValidationAtrribbute(persona);
        }
    }

    private void ValidationAtrribbute(Persona persona) {
        if (persona.getCedula().length()==0 || persona.getCedula().equals("") || persona.getCedula() == null) {
            throw new RequestException("El campo de cedula esta vacia", "error", HttpStatus.BAD_REQUEST);
        }

        if (persona.getCedula().length() != 10) {
            throw new RequestException("Cedula incorrecta", "code", HttpStatus.CREATED);
        } else {
            ValidationCedula(persona.getCedula());
        }

        if (persona.getNombre().length()==0 || persona.getNombre().equals("") || persona.getNombre() == null) {
            throw new RequestException("El campo de nombre esta vacio", "error", HttpStatus.BAD_REQUEST);
        }

        if (persona.getApellido().length()==0 || persona.getApellido().equals("") || persona.getApellido() == null) {
            throw new RequestException("El campo de apellido esta vacio", "error", HttpStatus.BAD_REQUEST);
        }

        if (persona.getTelefono().length() == 0 || persona.getTelefono().equals("") || persona.getTelefono() == null) {
            throw new RequestException("El campo de telefono esta vacio", "erro", HttpStatus.BAD_REQUEST);
        }

        if (persona.getTelefono().length() < 7 || persona.getTelefono().length() > 10) {
            throw new RequestException("No es un numero de telefono", "error", HttpStatus.BAD_REQUEST);
        } else {
            ValidationPhone(persona.getTelefono());
        }

        if (persona.getFechaNacimiento() == null || persona.getFechaNacimiento().equals("")) {
            throw new RequestException("Campo de fecha vacio", "error", HttpStatus.BAD_REQUEST);
        } else {
            ValidationDate(persona.getFechaNacimiento());
        }
        
        if(persona.getCorreo().length()==0 || persona.getCorreo().equals("") || persona.getCorreo() == null){
            throw new RequestException("Campo de correo vacio", "error", HttpStatus.BAD_REQUEST);
        }else{
            ValidationEmail(persona.getCorreo());
        }
        
        
    }

    private void ValidationCedula(String cedula) {
        int total = 0;

        try {
            int dni = Integer.parseInt(cedula);

            for (int i = 0; i < 9; i++) {
                char c = cedula.charAt(i);

                if (i % 2 == 0) {
                    if ((Character.getNumericValue(c) * 2) > 9) {
                        total = total + ((Character.getNumericValue(c) * 2) - 9);
                    } else {
                        total = total + ((Character.getNumericValue(c)) * 2);
                    }

                } else {
                    total = total + (Character.getNumericValue(c));
                }
            }

            int aux = (((total / 10) + 1) * 10) - total;
            if (aux == Character.getNumericValue(cedula.charAt(9))) {

            } else {
                throw new RequestException("La cedula es incorrecta", "error", HttpStatus.BAD_REQUEST);
            }

        } catch (NumberFormatException e) {
            throw new RequestException("La cedula es incorrecta", "error", HttpStatus.BAD_REQUEST);
        }
    }

    private void ValidationPhone(String telefono) {
        try {
            int phone = Integer.parseInt(telefono);
        } catch (NumberFormatException e) {
            throw new RequestException("No es un numero de telefono", "error", HttpStatus.BAD_REQUEST);
        }
    }
    
    private void ValidationDate(Date fechaNacimiento){
        Date fechaactual = new Date(System.currentTimeMillis());
        if(fechaNacimiento.after(fechaactual)){
            throw new RequestException("La fecha de nacimiento es superior a la fecha actual", "error", HttpStatus.BAD_REQUEST);
        }
    }
    
    private void ValidationEmail(String correo){
        ArrayList cuerpo = new  ArrayList();
        int arroba = 0;
        ArrayList corp = new ArrayList();
        int punto = 0;
        ArrayList dominio = new ArrayList();
        
        for(int i =0; i < correo.length(); i++){
            char c = correo.charAt(i);
            
            if(c=='@'){
                arroba++;
            }
            
            if(arroba==1 && c=='.'){
                punto++;
            }
            
            if(arroba == 0 ){
                cuerpo.add(c);
            }else{
                if(arroba ==1 && punto==0){
                    corp.add(c);
                }else{
                    if(arroba==1 && punto==1){
                        dominio.add(c);
                    }
                }
            }           
        }
        
        if(cuerpo.isEmpty() || corp.isEmpty() || dominio.isEmpty() || arroba >1 || punto > 1){
            throw new RequestException("Correo invalido", "erro", HttpStatus.BAD_REQUEST);
        }
    }
}

