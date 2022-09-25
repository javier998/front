package com.jchimbo.proyecto.controller;

import com.jchimbo.proyecto.entity.Usuario;
import com.jchimbo.proyecto.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Javier Chimbo
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/usuarios")
    public List<Usuario> GetAll(){
        return  usuarioService.GetAll();
    }
    
    @GetMapping("/usuario/{id}")
    public Usuario GetById(@PathVariable (value="id") String usuario_id){
        return  usuarioService.GetById(usuario_id);
    }
    
    @PostMapping("/usuario")
    public ResponseEntity Post(@RequestBody Usuario usuario){
        usuarioService.Save(usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    @PutMapping("/usuario/")
    public ResponseEntity Put(@RequestBody Usuario usuario,@PathVariable(value="id") String usuario_id){
        usuarioService.Update(usuario, usuario_id);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    @DeleteMapping("/usuario/{id}")
    public ResponseEntity Delete(@PathVariable(value="id") String usuario_id){
        usuarioService.Delete(usuario_id);
        return new ResponseEntity(HttpStatus.OK); 
    }
    
    @PostMapping("/usuario/auth")
    public Usuario GetToken(@RequestBody Usuario usuario){
        return usuarioService.GetToken(usuario);
    }
}
