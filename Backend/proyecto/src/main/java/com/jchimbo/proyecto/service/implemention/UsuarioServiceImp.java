package com.jchimbo.proyecto.service.implemention;

import com.jchimbo.proyecto.entity.Usuario;
import com.jchimbo.proyecto.repository.PersonaRepository;
import com.jchimbo.proyecto.repository.UsuarioRepository;
import com.jchimbo.proyecto.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Javier Chimbo
 */
@Service
public class UsuarioServiceImp implements UsuarioService{

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
        return  usuarioRepository.findById(usuario_id).get();
    }

    @Override
    public void Save(Usuario usuario) {
        personaRespository.saveAndFlush(usuario.getPersona());
        usuarioRepository.saveAndFlush(usuario);
    }

    @Override
    public void Update(Usuario usuario, String usuario_id) {
        usuario.setUsuario_id(usuario_id);
        usuarioRepository.saveAndFlush(usuario);
    }

    @Override
    public void Delete(String usuario_id) {
        usuarioRepository.deleteById(usuario_id);
    }

    @Override
    public Usuario GetToken(Usuario usuario) {
        return usuarioRepository.findById(usuario.getUsuario_id()).get();
    }

}
