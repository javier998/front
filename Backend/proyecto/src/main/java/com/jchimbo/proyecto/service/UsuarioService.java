
package com.jchimbo.proyecto.service;

import com.jchimbo.proyecto.entity.Usuario;
import java.util.List;

/**
 *
 * @author Javier Chimbo
 */
public interface UsuarioService {
    public List<Usuario> GetAll();
    public Usuario GetById(String usuario_id);
    public void Save(Usuario usuario);
    public void Update(Usuario usuario, String usuario_id );
    public void Delete(String usuario_id);
    public Usuario GetToken(Usuario usuario);
}
