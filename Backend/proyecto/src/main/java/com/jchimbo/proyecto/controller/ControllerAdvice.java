package com.jchimbo.proyecto.controller;

import com.jchimbo.proyecto.dto.ErrorDTO;
import com.jchimbo.proyecto.util.exception.RequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author Javier Chimbo
 */
@RestControllerAdvice
public class ControllerAdvice {

     @ExceptionHandler(value = RequestException.class)
    public ResponseEntity<ErrorDTO> requestExceptionHandler(RequestException ex){
        ErrorDTO error = ErrorDTO.builder().code(ex.getCode()).mensaje(ex.getMessage()).build();
        return new ResponseEntity<>(error, ex.getStatus());
    }
}
