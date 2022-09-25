package com.jchimbo.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author Javier Chimbo
 */

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    @Id
    @Column(name="usuario_id")
    private String usuario_id;
    
    @Column(name="password")
    private String password;
    
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="cedula")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
}
