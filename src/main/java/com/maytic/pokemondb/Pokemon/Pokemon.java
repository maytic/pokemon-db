package com.maytic.pokemondb.Pokemon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity for the pokemon database used for returns on h2 database
 */
@Entity
public class Pokemon{

    // set primary key
    @Id
    @GeneratedValue
    private int id;

    private String type1, type2;
    private String species;
    private String height;
    private String weight;
    private String ability1;
    private String ability2;
    private String locations;

    private String evYield;
    private String CatchRate;
    private String baseFriendship;
    private String baseExp;
    private String growthRate;
    private String name;

    private int baseHp;
    private int minHp;
    private int maxHp;

    private int baseAttack;
    private int minAttack;
    private int maxAttack;

    private int baseDefense;
    private int minDefense;
    private int maxDefense;

    private int baseSpAtk;
    private int minSpAtk;
    private int maxSpAtk;

    private int baseSpDef;
    private int minSpDef;
    private int maxSpDef;

    private int baseSpeed;
    private int minSpeed;
    private int maxSpeed;

    private int totalBase;

    private String eggGroups;
    private String gender;
    private String eggCycles;





    public String getEggGroups() {
        return eggGroups;
    }

    public void setEggGroups(String eggGroups) {
        this.eggGroups = eggGroups;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEggCycles() {
        return eggCycles;
    }

    public void setEggCycles(String eggCycles) {
        this.eggCycles = eggCycles;
    }

    public int getBaseSpAtk() {
        return baseSpAtk;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(int baseHp) {
        this.baseHp = baseHp;
    }

    public int getMinHp() {
        return minHp;
    }

    public void setMinHp(int minHp) {
        this.minHp = minHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getMinAttack() {
        return minAttack;
    }

    public void setMinAttack(int minAttack) {
        this.minAttack = minAttack;
    }

    public int getMaxAttack() {
        return this.maxAttack;
    }

    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public int getMinDefense() {
        return minDefense;
    }

    public void setMinDefense(int minDefense) {
        this.minDefense = minDefense;
    }

    public int getMaxDefense() {
        return maxDefense;
    }

    public void setMaxDefense(int maxDefense) {
        this.maxDefense = maxDefense;
    }

    public int getBasSpAtk() {
        return baseSpAtk;
    }

    public void setBaseSpAtk(int basSpAtk) {
        this.baseSpAtk = basSpAtk;
    }

    public int getMinSpAtk() {
        return minSpAtk;
    }

    public void setMinSpAtk(int minSpAtk) {
        this.minSpAtk = minSpAtk;
    }

    public int getMaxSpAtk() {
        return maxSpAtk;
    }

    public void setMaxSpAtk(int maxSpAtk) {
        this.maxSpAtk = maxSpAtk;
    }

    public int getBaseSpDef() {
        return baseSpDef;
    }

    public void setBaseSpDef(int baseSpDef) {
        this.baseSpDef = baseSpDef;
    }

    public int getMinSpDef() {
        return minSpDef;
    }

    public void setMinSpDef(int minSpDef) {
        this.minSpDef = minSpDef;
    }

    public int getMaxSpDef() {
        return maxSpDef;
    }

    public void setMaxSpDef(int maxSpDef) {
        this.maxSpDef = maxSpDef;
    }

    public int getTotalBase() {
        return totalBase;
    }

    public void setTotalBase(int totalBase) {
        this.totalBase = totalBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHeight() {
        return height;
    }

    public void setHeightM(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAbility1() {
        return ability1;
    }

    public void setAbility1(String ability1) {
        this.ability1 = ability1;
    }

    public String getAbility2() {
        return ability2;
    }

    public void setAbility2(String ability2) {
        this.ability2 = ability2;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getEVYield() {
        return evYield;
    }

    public void setEVYield(String EVYield) {
        this.evYield = EVYield;
    }

    public String getCatchRate() {
        return CatchRate;
    }

    public void setCatchRate(String catchRate) {
        CatchRate = catchRate;
    }

    public String getBaseFriendship() {
        return baseFriendship;
    }

    public void setBaseFriendship(String baseFriendship) {
        this.baseFriendship = baseFriendship;
    }

    public String getBaseExp() {
        return baseExp;
    }

    public void setBaseExp(String baseExp) {
        this.baseExp = baseExp;
    }

    public String getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(String growthRate) {
        this.growthRate = growthRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\nTraining: \n\tEV Yield: " + evYield + "\n\tCatch Rate: " + CatchRate
                + "\n\tBase FriendShip: " + baseFriendship + "\n\tBase EXP: " + baseExp + "\n\tGrowth Rate: " + growthRate
                +"\nPokedex Data: \n\tNational Number: " + id + "\n\tType 1: " + type1
                + "\n\tType 2: " + type2+ "\n\tSpecies: " + species
                + "\n\tHeight: " + height + "\n\tWeight: " + weight + "\n\tAbility 1: " + ability1
                + "\n\tAbility 2: " + ability2 + "\n\tLocations: " +  locations
                + "\nBase Stats: \n\tHp: " +  baseHp + " " + minHp + " " + maxHp
                + "\n\tAttack: " + baseAttack + " " + minAttack + " " + maxAttack
                + "\n\tDefense: " + baseDefense + " " + minDefense + " " + maxDefense
                + "\n\tSp. Atk: " + baseSpAtk + " " + minSpAtk + " " + maxSpAtk
                + "\n\tSp. Def: " + baseSpDef + " " + minSpDef + " " + minSpDef
                + "\n\tSpeed: " + baseSpeed + " " + minSpeed + " " + maxSpeed
                + "\n\tTotal: " +totalBase
                + "\nBreeding: \n\tEgg Groups" + eggGroups + "\n\tGender: " + gender
                + "\n\tEgg Cycles: " + eggCycles
                ;
    }


}