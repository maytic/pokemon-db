package com.maytic.pokemondb.Pokemon;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * PokemonRepository handles all queries to h2 database
 */
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    /**
     * function searches h2 database by name
     * @param name - the name of the pokemon
     * @return List<pokemon> object containing the pokemon's data
     */
    public List<Pokemon> findByName(String name);
}
