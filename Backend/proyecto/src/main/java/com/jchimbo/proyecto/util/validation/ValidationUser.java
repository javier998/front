package com.jchimbo.proyecto.util.validation;

import com.jchimbo.proyecto.entity.Usuario;
import com.jchimbo.proyecto.util.exception.RequestException;
import org.springframework.http.HttpStatus;

/**
 *
 * @author Javier Chimbo
 */
public class ValidationUser {

    public ValidationUser(){}
    
    /** Metodo para controlar las validaciones en la peticion del GET
     * En el caso de que no exista el ID lanza una exception
     * @param exist     
     */
    public void ValidationExistFalse(boolean exist){
        if(!exist){
            throw new RequestException("El usuario no existe", "p-1", HttpStatus.NOT_FOUND);
        } 
    }
    
    /** Metodo para controlar las validaciones en la peticion del POST
     * En el caso de que existe el ID lanza una exception
     * @param exist
     * @param usuario     
     */
    public void ValidationExistTrue(boolean exist, Usuario usuario){
        if(exist){
            throw new RequestException("El usuario ya existe", "p-3", HttpStatus.BAD_REQUEST);
        }else{
            ValidationAtrribbute(usuario);
        }
    }
    
    /** Metodo que recibe datos tanto del cliente como del servidor para la validacion
     * @param usuarioRequest
     * @param usarioResponse
     */
    public void Validation(Usuario usuarioRequest, Usuario usarioResponse){
        ValidationCredencials(usuarioRequest, usarioResponse);
    }
    
    
    
    private void ValidationCredencials(Usuario usuarioRequest, Usuario usuarioResponse){
        if(!(usuarioResponse.getPassword().equals(usuarioRequest.getPassword()))){
            throw new RequestException("Error de contarseña", "p-2", HttpStatus.NOT_FOUND);
        }
    }
    
    private void ValidationAtrribbute(Usuario usuario){
        if(usuario.getUsuario_id().equals("") || usuario.getUsuario_id().length()==0 || usuario.getUsuario_id()== null){
            throw new RequestException("El nombre de usuario esta vacio", "p-1", HttpStatus.BAD_REQUEST);
        }
        
        if(usuario.getUsuario_id().length()<6 || usuario.getUsuario_id().length()>17){
            throw new RequestException("El nombre de usuario debe estar en un rango de 8 a 16 caracteres", "p-1", HttpStatus.BAD_REQUEST);
        }
        
        if(usuario.getPassword().equals("") || usuario.getPassword().length()==0 || usuario.getPassword()==null){
            throw new RequestException("El campo de password esta vacio", "p-1", HttpStatus.BAD_REQUEST);
        }
        
        if(usuario.getPassword().length()<8 || usuario.getPassword().length()>17 ){
            throw new RequestException("La contraseña debe de estra en un rago de 8 a 16 caracteres", "p-1", HttpStatus.BAD_REQUEST);
        }
    }
    
}
