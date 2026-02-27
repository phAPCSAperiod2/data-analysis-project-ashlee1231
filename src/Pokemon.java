/**
 * Represents one row from your dataset.
 *
 *  - Add Javadoc comments for the class and all methods
 */
public class Pokemon {


    private String name;
    private String type1;
    private String type2;
    private int attack;

    Pokemon (String name, String type1, String type2, int attack) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.attack = attack;

    }

    public String getName() {
        return name;
    }
    public int getAttack() {
        return attack;
    }
    public String getType1() {
        return type1;
    }
    public String getType2() {
        return type2;
    }

    public static Pokemon strongestPokemon(Pokemon[] pokemonList){
        Pokemon strongestPokemon = pokemonList[0];
        for (int i = 0; i < pokemonList.length-1; i++) {
            if (pokemonList[i].getAttack() > pokemonList[i+1].getAttack()) {
                strongestPokemon = pokemonList[i];
            }
            else {
                strongestPokemon = pokemonList[i];
            }
        }

        return strongestPokemon;

        }

    public static double avgType(String userInputType, Pokemon[] pokemonList) {
        int sum = 0;
        int numTypes = 0;
        for (int i = 0; i < pokemonList.length; i++) {
            if (pokemonList[i].getType1().equals(userInputType) || pokemonList[i].getType2().equals(userInputType)) {
                sum += pokemonList[i].getAttack();
                numTypes++;
            }
        }
        double average = (double)sum / numTypes;
        System.out.println("Amount of " + userInputType + ": " + numTypes);
        return average;
    }
    
    public String toString() {
        if (this.type2.equals("")) {

        return "This pokemon is " + name + "/n Types: " + this.getType1() + " and " + this.getType2() + "/n Attack: " + this.getAttack();
        }

        return "This pokemon is " + name + "/n Type: " + this.getType1() + "/n Attack: " + this.getAttack();
    }

}