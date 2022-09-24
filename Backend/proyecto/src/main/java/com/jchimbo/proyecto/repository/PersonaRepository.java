
package com.jchimbo.proyecto.repository;

import com.jchimbo.proyecto.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Javier Chimbo
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, String>{

}
