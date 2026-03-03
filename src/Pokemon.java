/**
 * Represents a Pokémon with its attributes including name, types, and attack power.
 * This class encapsulates data for a single Pokémon entry from the dataset.
 */
public class Pokemon {


    private String name;
    private String type1;
    private String type2;
    private int attack;

    /**
     * Constructs a Pokemon object with specified attributes.
     *
     * @param name   the name of the Pokemon
     * @param type1  the primary type of the Pokemon
     * @param type2  the secondary type of the Pokemon
     * @param attack the attack stat of the Pokemon
     */
    Pokemon (String name, String type1, String type2, int attack) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.attack = attack;

    }

    /**
     * Gets the name of the Pokemon.
     *
     * @return the name of the Pokemon
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the attack stat of the Pokemon.
     *
     * @return the attack power of the Pokemon
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Gets the primary type of the Pokemon.
     *
     * @return the primary type
     */
    public String getType1() {
        return type1;
    }

    /**
     * Gets the secondary type of the Pokemon.
     *
     * @return the secondary type
     */
    public String getType2() {
        return type2;
    }

    /**
     * Finds and returns the Pokemon with the highest attack stat from the given list.
     *
     * @param pokemonList the array of Pokemon objects to search
     * @param pokemonCount the number of valid Pokemon elements in the array
     * @return the Pokemon with the highest attack stat
     */
    public static Pokemon strongestPokemon(Pokemon[] pokemonList, int pokemonCount){
        Pokemon strongestPokemon = pokemonList[0];
        for (int i = 0; i < pokemonCount; i++) {
            if (pokemonList[i].getAttack() > strongestPokemon.getAttack()) {
                strongestPokemon = pokemonList[i];
            }
        }

        return strongestPokemon;

        }

    /**
     * Calculates the average attack stat for all Pokemon of a specified type.
     * Also prints the count of Pokemon with the specified type.
     *
     * @param pokemonType the type to search for (primary or secondary)
     * @param pokemonList the array of Pokemon objects to analyze
     * @param pokemonCount the number of valid Pokemon elements in the array
     * @return the average attack stat for Pokemon of the specified type
     */
    public static double avgType(String pokemonType, Pokemon[] pokemonList, int pokemonCount) {
        int sum = 0;
        int numTypes = 0;
        for (int i = 0; i < pokemonCount; i++) {
            if (pokemonList[i].getType1().equals(pokemonType) || pokemonList[i].getType2().equals(pokemonType)) {
                sum += pokemonList[i].getAttack();
                numTypes++;
            }
        }
        double average = (double)sum / numTypes;
        System.out.println("Amount of " + pokemonType + ": " + numTypes);
        return average;
    }
    
    /**
     * Returns a string representation of the Pokemon including its name, type(s), and attack stat.
     *
     * @return a formatted string describing the Pokemon's attributes
     */
    public String toString() {
        if (this.type2.equals("")) {

        return "This pokemon is " + name + "\n Types: " + this.getType1() + " and " + this.getType2() + "\n Attack: " + this.getAttack();
        }

        return "This pokemon is " + name + "\n Types: " + this.getType1() + " and " + this.getType2() + "\n Attack: " + this.getAttack();
    }

}