package com.maytic.pokemondb.Pokemon;

import com.maytic.pokemondb.Exceptions.PokemonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
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
        List<Pokemon> pokemon = repository.findByNameIgnoreCase(name);
        if(pokemon.isEmpty()){
            throw new PokemonNotFoundException("pokemon not found with name: " + name);
        }
        return pokemon;
    }

    /**
     * function returns total count of pokemon in h2 database
     * @return - total count of pokemon as long
     */
    @GetMapping("pokemon/count")
    public long getCount(){
        return repository.count();
    }

    /**
     * function returns a list of 5 pokemon searched by name ignoring case sensitive
     * handles client search
     * @throws PokemonNotFoundException when no pokemon are found containing that pokemon
     * @param name - name of pokemon being searched
     * @return - list of pokemon
     */
    @GetMapping("pokemons")
    public List<Pokemon> getTop5ByName(@RequestParam(value = "name")String name){
        Sort.TypedSort<Pokemon> pokemon = Sort.sort(Pokemon.class);
        Sort sort = pokemon.by(Pokemon::getName).ascending();

        List<Pokemon> pokemonList = repository.findTop5ByNameContainingIgnoreCase(name,sort);

        if(pokemonList.isEmpty()){
            throw new PokemonNotFoundException("No Such Pokemon");
        }
        return pokemonList;
    }

    /**
     * function returns pokemon of type requested ex. "Water" sorted by id ignores case sensitive
     * @param type String representing the type of pokemon
     *             Water
     *             Fire
     *             Electric
     *             etc...
     * @return - List of pokemon
     */
    @GetMapping("pokemons/type/{type}")
    public List<Pokemon> getByType(@PathVariable(value = "type") String type){
        Sort.TypedSort<Pokemon> pokemon = Sort.sort(Pokemon.class);
        Sort sort = pokemon.by(Pokemon::getId).ascending();

        List<Pokemon> pokemonList = repository.findByType(type);

        if(pokemonList.isEmpty()){
            throw new PokemonNotFoundException("No pokemon found of type \"" + type + "\"");
        }

        return pokemonList;
    }


}
