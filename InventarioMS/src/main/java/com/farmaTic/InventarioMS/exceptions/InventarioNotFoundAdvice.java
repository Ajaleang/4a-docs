package com.farmaTic.InventarioMS.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody

public class InventarioNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(InventarioNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntintyNotFoundAdvice(InventarioNotFoundException ex) {
        return ex.getMessage();
    }
}

