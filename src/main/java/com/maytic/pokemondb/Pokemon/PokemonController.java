package com.maytic.pokemondb.Pokemon;

import com.maytic.pokemondb.Exceptions.PokemonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * REST controller handles all pokemon data http request
 */
@RestController
public class PokemonController {

    // autowire h2 repository
    @Autowired
    PokemonRepository repository;

    /**
     * function searches database using the id of a pokemon
     * @throws PokemonNotFoundException when a pokemon is not found by id
     * @param id - pokemon's id or primary key in h2 database
     * @return - Optional<Pokemon> object
     */
    @GetMapping("pokemon/{id}")
    public Optional<Pokemon> getPokemonById(@PathVariable Integer id){
        Optional<Pokemon> pokemon = repository.findById(id);
            if(!pokemon.isPresent()){
                throw new PokemonNotFoundException("pokemon not found with id: " + id);
            }
        return pokemon;
    }

    /**
     * function searches database using the name of a pokemon
     * @throws PokemonNotFoundException when a pokemon is not found by name
     * @param name - pokemon's name
     * @return - List<Pokemon> object
     */
    @GetMapping("pokemon")
    public List<Pokemon> getPokemonByName(@RequestParam(value = "name") String name){
        List<Pokemon> pokemon = repository.findByName(name);
        if(pokemon.isEmpty()){
            throw new PokemonNotFoundException("pokemon not found with name: " + name);
        }
        return pokemon;
    }
}
