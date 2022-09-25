package com.jchimbo.proyecto.service.implemention;

import com.jchimbo.proyecto.entity.Usuario;
import com.jchimbo.proyecto.repository.PersonaRepository;
import com.jchimbo.proyecto.repository.UsuarioRepository;
import com.jchimbo.proyecto.service.UsuarioService;
import com.jchimbo.proyecto.util.validation.ValidationPerson;
import com.jchimbo.proyecto.util.validation.ValidationUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Javier Chimbo
 */
@Service
public class UsuarioServiceImp implements UsuarioService{

    ValidationUser validationUser = new ValidationUser();
    ValidationPerson validationPerson = new ValidationPerson();
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    @Autowired
    PersonaRepository personaRespository;
    
    
    @Override
    public List<Usuario> GetAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario GetById(String usuario_id) {
        validationUser.ValidationExistFalse(usuarioRepository.existsById(usuario_id));
        return  usuarioRepository.findById(usuario_id).get();
    }

    @Override
    public void Save(Usuario usuario) {
        validationUser.ValidationExistTrue(usuarioRepository.existsById(usuario.getUsuario_id()),usuario);
        validationPerson.ValidationExistTrue(personaRespository.existsById(usuario.getPersona().getCedula()),usuario.getPersona());
        personaRespository.saveAndFlush(usuario.getPersona());
        usuarioRepository.saveAndFlush(usuario);
    }

    @Override
    public void Update(Usuario usuario, String usuario_id) {
        validationUser.ValidationExistFalse(usuarioRepository.existsById(usuario_id));
        validationPerson.ValidationExistFalse(personaRespository.existsById(usuario.getPersona().getCedula()));
        personaRespository.saveAndFlush(usuario.getPersona());
        usuarioRepository.saveAndFlush(usuario);
    }

    @Override
    public void Delete(String usuario_id) {
        validationUser.ValidationExistFalse(usuarioRepository.existsById(usuario_id));
        usuarioRepository.deleteById(usuario_id);
    }

    @Override
    public Usuario GetToken(Usuario usuarioRequest) {
            validationUser.ValidationExistFalse(usuarioRepository.existsById(usuarioRequest.getUsuario_id()));
            validationUser.Validation(usuarioRequest, usuarioRepository.findById(usuarioRequest.getUsuario_id()).get());
        return usuarioRepository.findById(usuarioRequest.getUsuario_id()).get();
    }

}
