package com.maytic.pokemondb.Pokemon;


import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
    public List<Pokemon> findByNameIgnoreCase(String name);

    /**
     * get total count of pokemon
     * @return - long
     */
    public long count();

    /**
     * return a list of pokemon of the top 5 pokemon by containing name
     * @param name
     * @param sort
     * @return
     */
    List<Pokemon> findTop5ByNameContainingIgnoreCase(String name, Sort sort);

    /**
     * returns list of pokemon containing that type
     * @param type
     * @return
     */
    @Query(value = "SELECT * FROM POKEMON WHERE LOWER (TYPE1) = :type OR" +
            " LOWER (TYPE2) = :type",nativeQuery = true)
    List<Pokemon> findByType(@Param("type") String type);
}
