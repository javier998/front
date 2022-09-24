package com.jchimbo.proyecto.util.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 *
 * @author Javier Chimbo
 */
@Data
public class RequestException extends RuntimeException{

    private String code;
    private HttpStatus status;
    
    public RequestException(String mensaje, String code, HttpStatus status) {
        super(mensaje);
        this.code = code;
        this.status = status;
    }
    
}
