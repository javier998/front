
package com.jchimbo.proyecto.repository;

import com.jchimbo.proyecto.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Javier Chimbo
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
