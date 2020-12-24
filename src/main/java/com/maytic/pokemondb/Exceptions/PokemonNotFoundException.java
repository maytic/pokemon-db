package com.maytic.pokemondb.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * pokemon not found exception used when a query in PokemonController.class
 * returns null or is empty
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PokemonNotFoundException extends RuntimeException{

    public PokemonNotFoundException(String message){
        super(message);
    }
}
