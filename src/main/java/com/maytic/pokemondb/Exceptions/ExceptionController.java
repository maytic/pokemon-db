package com.maytic.pokemondb.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

/**
 * controller handles all of the exceptions in the webservice
 */
@ControllerAdvice
@RestController
public class ExceptionController {

    /**
     * funtion returns a response to user of 404 not found when thrown
     * @param ex - the exception
     * @param request the request where the exception pertains to
     * @return
     */
    @ExceptionHandler(PokemonNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundExceptions (PokemonNotFoundException ex, WebRequest request){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}
