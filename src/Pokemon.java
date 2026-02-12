/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
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
    private int defense;
    private int speed;


    // TODO: Create a constructor that takes all attributes as parameters
    Pokemon (String name, String type1, String type2, int attack, int defense, int speed) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }


    // TODO: Add getters for attributes you need
    public String getName() {
        return name;
    }
    public String getType1() {
        return type1;
    }

    // TODO: Add other data analysis methods

    // TODO: Override toString() to return a readable representation of your object

}