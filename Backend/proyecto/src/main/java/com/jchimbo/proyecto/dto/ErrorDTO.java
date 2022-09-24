package com.jchimbo.proyecto.dto;


import lombok.Builder;
import lombok.Data;

/**
 *
 * @author Javier Chimbo
 */
@Data
@Builder
public class ErrorDTO {
    private String code;
    private String mensaje;
}
