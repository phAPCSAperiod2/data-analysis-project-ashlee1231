import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini‑Project.
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException {

        //CSV file path and scanner setup
        File file = new File("pokemon.csv");
        Scanner scan = new Scanner(file);
        Scanner userScan = new Scanner(System.in);

        //Create an array of Data objects to store data
        Pokemon[] pokemonList = new Pokemon[152];


        // Reading file using scanner and parsing data

        //Skipping the header row
        scan.nextLine();
        // - Loop through rows
        for (int i = 0; i < pokemonList.length; i++) {
            String line = scan.nextLine();
            String[] columns = line.split(",");
            // Assuming columns are: name, type1, type2, attack, defense, speed
            String name = columns[1];
            String type1 = columns[2];
            String type2 = columns[3];
            int attack = Integer.parseInt(columns[5]);

            // Create a new Pokemon object and add to the array
            pokemonList[i] = new Pokemon(name, type1, type2, attack);
        }
        scan.close();

        System.out.println("Guiding Question: /n What pokemon are the strongest?");
        // Example:
        // double maxValue = findMaxValue(dataList);
        // double average = computeAverageValue(dataList);
        Pokemon strongestPokemon = Pokemon.strongestPokemon(pokemonList);

        System.out.println("What type are you interested in? ");
        String userInput = userScan.nextLine();
        double averageValue = Pokemon.avgType(userInput, pokemonList);

        userScan.close();

        // - Number of rows loaded
        System.out.println("Number of rows loaded: " + pokemonList.length);
        
        // - Final answer to your guiding question
        System.out.println("The strongest pokemon is " + strongestPokemon.getName());
        System.out.println(strongestPokemon.toString());
        System.out.println("The type you investigated is " + userInput + " with an average attack of " + averageValue);
    }


}