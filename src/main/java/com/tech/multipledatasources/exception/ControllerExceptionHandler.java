package com.tech.multipledatasources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

public class ControllerExceptionHandler {
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<CustomException> genericExceptionHandler(Exception ex, WebRequest request) {
        CustomException customException = new CustomException(
            HttpStatus.EXPECTATION_FAILED.value(),
            ex.getMessage(),
            new Date(),
            request.getDescription(false)
            );
        
        return new ResponseEntity<CustomException>(customException, HttpStatus.EXPECTATION_FAILED);
      }
}
