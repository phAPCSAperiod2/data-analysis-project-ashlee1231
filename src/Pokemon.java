/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 */
public class Pokemon {

    // TODO: Add at least 3 private attributes
    // Example:
    private String name;
    private String type1;
    private String type2;
    private int attack;


    // TODO: Create a constructor that takes all attributes as parameters
    Pokemon (String name, String type1, String type2, int attack) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.attack = attack;

    }


    // TODO: Add getters for attributes you need
    public String getName() {
        return name;
    }
    public int getAttack() {
        return attack;
    }

    // TODO: Add other data analysis methods
    public static String strongestType(Pokemon[] pokemonList){
        double fireAvg = 0;
        double waterAvg = 0;
        double grassAvg = 0;
        double flyAvg = 0;
        double poisAvg = 0;
        double bugAvg = 0;
        double ghostAvg = 0;
        double darkAvg = 0;
        double normAvg = 0;
        double psyAvg = 0;
        double fightAvg = 0;
        double iceAvg = 0;
        double rockAvg = 0;
        double elecAvg = 0;
        double dragonAvg = 0;

        for (int i = 0; i < pokemonList.length; i++) {

        }
    }
    

    // TODO: Override toString() to return a readable representation of your object

}