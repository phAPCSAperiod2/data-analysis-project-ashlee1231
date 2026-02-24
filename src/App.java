import java.io.File;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    public static void main(String[] args) {

        //CSV file path and scanner setup
        File file = new File("pokemon.csv");
        Scanner scan = new Scanner(file);

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

        // TODO: Call your analysis methods
        // Example:
        // double maxValue = findMaxValue(dataList);
        // double average = computeAverageValue(dataList);


        // TODO: Print insights
        // - Number of rows loaded
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question


        // OPTIONAL TODO:
        // Add user interaction:
        // Ask the user what kind of analysis they want to see
    }


}