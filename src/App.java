import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main application for the Pokémon Data Analysis Mini-Project.
 * This application reads Pokémon data from a CSV file, analyzes the data,
 * and identifies the strongest Pokémon and average attack stats by type.
 */
public class App {

    /**
     * Main method that drives the Pokémon data analysis application.
     * Reads Pokémon data from a CSV file, finds the strongest Pokémon,
     * and calculates average attack stats for a specified type.
     *
     * @param args command-line arguments (not used in this program)
     * @throws FileNotFoundException if the Pokemon data file cannot be found
     */
    public static void main(String[] args) throws FileNotFoundException {

        //CSV file path and scanner setup
        File file = new File("Data/pokemon.csv");
        Scanner scan = new Scanner(file);
        Scanner userScan = new Scanner(System.in);

        //Create an array of Data objects to store data
        Pokemon[] pokemonList = new Pokemon[152];
        int pokemonCount = 0;

        // Reading file using scanner and parsing data

        //Skipping the header row
        scan.nextLine();
        // - Loop through rows
        for (int i = 0; i < pokemonList.length; i++) {
            String type2;
            if (!scan.hasNextLine()) {
                break; // Exit loop if there are no more lines to read
            }
            String line = scan.nextLine();
            String[] columns = line.split(",");
            // Assuming columns are: name, type1, type2, attack, defense, speed
            String name = columns[1];
            String type1 = columns[2];
            if (columns[3].isEmpty()) {
                type2 = "None";
            }
            else {        
                type2 = columns[3];
            }
            int attack = Integer.parseInt(columns[5]);

            // Create a new Pokemon object and add to the array
            pokemonList[i] = new Pokemon(name, type1, type2, attack);
            pokemonCount++;
        }
        scan.close();

        System.out.println("Guiding Question: \n What pokemon are the strongest?");
        // Example:
        // double maxValue = findMaxValue(dataList);
        // double average = computeAverageValue(dataList);
        Pokemon strongestPokemon = Pokemon.strongestPokemon(pokemonList, pokemonCount);

        double averageValue = Pokemon.avgType("Grass", pokemonList, pokemonCount);

        userScan.close();

        // - Number of rows loaded
        System.out.println("Number of rows loaded: " + pokemonCount);
        
        // - Final answer to your guiding question
        System.out.println("The strongest pokemon is " + strongestPokemon.getName());
        System.out.println(strongestPokemon.toString());
        System.out.println("The type you investigated is Grass with an average attack of " + averageValue);
    }


}