[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22617074)
# AP CSA Mini‑Project: Data Analysis with Arrays & File Input
### Using CSV Files • Arrays of Objects • Algorithms • Data Ethics & Quality

---

## 📌 Project Overview
In this mini‑project, you will choose a dataset (CSV file), design a **custom class** to represent each row, read the dataset using the **Scanner** class, store all data as **objects** in an ArrayList or array, and answer a **guiding question** by analyzing the data.

This project reinforces:

- Arrays & ArrayLists  
- File input with `Scanner`  
- Class design (attributes, constructors, methods)  
- Algorithms (min, max, average, filtering)  
- Data quality & ethics  
- Documentation using **Javadoc**  
- Creating a **UML class diagram**  

By the end, you will produce insights and answer your original question using your program.

---

## 🎯 Your Task
You will:

1. **Choose a dataset** (teacher provided or public).  
2. **Write a guiding question** for your dataset.  
3. **Design a Java class** with ≥ 3 attributes.  
4. **Use `Scanner` to read a CSV file**, parse rows, and construct objects.  
5. **Store all objects** in an array or ArrayList.  
6. **Analyze the dataset** using algorithms you create.  
7. **Print insights** and answer your guiding question.  
8. **Document your code** with Javadoc.  
9. **Create a UML class diagram** representing your custom class.  

Optional stretch challenges are included at the bottom!

---

## 🧪 Example Questions You Might Ask
Your dataset might allow you to answer things like:

- *"Which Pokémon type has the highest average Attack?"*  
- *"Which U.S. state had the lowest obesity rate in 2020?"*  
- *"What country had the highest CO₂ emissions in 2000?"*  
- *"What is the average HP for Fire-type Pokémon?"*  

Think simple, clear, and answerable.

---

## 📁 Project Structure
Your repository should follow this structure:
```
/src
    App.java
    Pokemon.java
/Data
    pokemon.csv
README.md   ← this file
UML_Diagram.png (or UML_Diagram.pdf)
```

---

## 🧩 Step 1 — Choose Your Dataset

**Dataset Name:** Pokemon Generation 1 Dataset

**Source / Link:** https://www.kaggle.com/abcsds/pokemon

**What this dataset contains (2–3 sentences:**
This dataset contains information about 151 Pokémon from Generation 1, including their names, primary and secondary types, and battle stats (HP, Attack, Defense, Speed). Each row represents a unique Pokémon with attributes that describe its characteristics in battle. The data allows for analysis of type distributions and statistical comparisons across different Pokémon.

---

## ❓ Step 2 — Write Your Guiding Question

Your guiding question should be something you can answer using your dataset.

**My guiding question:**

"What Pokémon is the strongest (has the highest attack stat), and what is the average attack power of Grass-type Pokémon?"

Examples:

- "Which Pokémon has the highest HP?"  
- "What is the average life expectancy in this dataset?"  
- "Which state had the highest vaccination rate?"  

---

## 🧱 Step 3 — Design Your Class

You must create a class that represents **one row** of your dataset.

### ✔ Your class must include:

- **At least 3 private attributes** (name, type1, type2, attack)
- **A constructor** that takes all attributes as parameters  
- **Getter methods** for attributes you plan to analyze (getName, getAttack, getType1, getType2)
- **`toString()`** for easy printing  
- Any additional analysis/helper methods as needed (strongestPokemon, avgType)

### ✏ Include your class diagram

UML Diagram for Pokemon class:
```
┌─────────────────────────────────┐
│          Pokemon                │
├─────────────────────────────────┤
│ - name: String                  │
│ - type1: String                 │
│ - type2: String                 │
│ - attack: int                   │
├─────────────────────────────────┤
│ + Pokemon(String, String, ...): │
│ + getName(): String             │
│ + getAttack(): int              │
│ + getType1(): String            │
│ + getType2(): String            │
│ + toString(): String            │
│ + strongestPokemon([], int):Poke│
│ + avgType(String, [], int):doub │
└─────────────────────────────────┘
```

## 📥 Step 4 — Read Your CSV File Using Scanner

In `Main.java`, you must:

- Create a `File` object  
- Use `Scanner` to read the file  
- Skip the header row (if needed)  
- Read each line  
- Split by commas using `.split(",")`  
- Trim whitespace  
- Parse numbers using `Integer.parseInt()` or `Double.parseDouble()`  
- Construct objects  
- Add them to an ArrayList or array  

### Column → Attribute Map

| Attribute Name | CSV Column Name | Column Index # | Notes |
|----------------|------------------|----------------|-------|
| name           | Pokemon          | 1              | Pokémon's name |
| type1          | Type 1           | 2              | Primary type  |
| type2          | Type 2           | 3              | Secondary type |
| attack         | Attack           | 5              | Attack stat   |

---

## 📊 Step 5 — Analyze Your Data

You must write **at least two algorithms** to analyze your dataset.

### Required: Choose 2 or more algorithms
- [x] Maximum value of attribute (Attack stat)
- [x] Average of attribute by category (Average attack for Grass-type)
- [ ] Minimum value of attribute  
- [ ] Filter by category  
- [ ] Count items matching a condition  

**Algorithms I will implement:**

1. **Find Strongest Pokémon:** Find the Pokémon with the maximum attack stat using a simple iteration through the array
2. **Calculate Average Attack by Type:** Calculate the average attack power for all Pokémon of a specified type (Grass-type) by filtering and averaging

Optional extras:  
- Sorting  
- Top/bottom N items  
- Grouping by category  
- Comparison between groups  

---

## 🧠 Step 6 — Insights & Answer to Your Question

After analyzing your objects, print:

- ✔ How many rows were loaded: **151 Pokémon**
- ✔ Your algorithm results: 
  - Strongest Pokémon: **Dragonite with an attack stat of 134**
  - Average attack for Grass-type: **72.36** (14 Grass-type Pokémon)
- ✔ A clear answer to your guiding question  

**My findings:**

Analyzing 151 Generation 1 Pokémon, I discovered that Dragonite is the strongest Pokémon overall with an attack stat of 134. This Dragon/Flying-type is notably more powerful than other Pokémon like Kingler and Gyarados, both of which have attack stats in the 125-130 range. Grass-type Pokémon (14 in total) have an average attack power of approximately 72.36, making them slightly below the overall average. This indicates that Grass-types are generally balanced Pokémon with moderate attack power.

**My answer to the guiding question:**

The strongest Pokémon in Generation 1 is **Dragonite with an attack stat of 134**. Grass-type Pokémon have an average attack of 72.36, which is respectable compared to other types but reflects their role as balanced attackers with strengths in Special Attack rather than physical Attack.

---

## 📝 Step 7 — Documentation Requirements

### ✔ Javadoc Comments
You MUST use Javadoc for:

- Every **class**  
- Every **method**  
- Every **parameter**  
- Every **return value**  

Example:
```java
/**
 * Returns the highest HP among all Pokémon.
 * @param list the ArrayList of Pokémon objects
 * @return highest HP value in the dataset
 */
public static int findMaxHP(ArrayList<Pokemon> list) {
    // implementation
}
```

### ✔ UML Class Diagram
Add a UML diagram showing:

- Class name
- Attributes
- Methods
- Visibility (private/public)

Save as `UML_Diagram.png` or `.pdf` in the repo.

---

## 🛡 Step 8 — Data Ethics & Quality Reflection
Write a short reflection (3–5 sentences):

- What data-quality issues did you find?
- Could your dataset be biased?
- How might incomplete or inaccurate data affect results?
- How trustworthy are your insights?

**My reflection:**

The Pokémon dataset is relatively clean with complete entries for the 151 Pokémon in Generation 1. However, the data may be biased toward comparing statistical power rather than in-game strategic value, because it does not account for their move sets. The dataset is limited to Generation 1 Pokémon, so conclusions cannot be generalized to later generations. Missing data for move pools and abilities could affect strategic analysis. Overall, the dataset is trustworthy for basic statistical analysis of Generation 1 Pokémon stats, but would need to add in later Pokemon to be generalizable to the entire franchise.

- Which attribute to analyze
- Which category to filter
- What statistics they want to calculate

### 🔹 Additional Algorithms

- Sorting objects
- Multiple comparisons
- Generating summaries
- Exporting results to a file

### 🔹 Data Cleaning

- Skip rows with missing values
- Detect invalid entries
- Normalize units

---

## ✅ Submission Checklist

- [ ] Dataset selected
- [ ] Guiding question written
- [ ] Class created with ≥3 attributes
- [ ] File reading implemented
- [ ] ArrayList/array of objects created
- [ ] At least 2 analysis algorithms implemented
- [ ] Findings printed
- [ ] Javadoc comments added
- [ ] UML diagram included
- [ ] Reflection completed
- [ ] Code compiles & runs

---

Good luck, and have fun exploring your dataset! 🚀  
You're now doing real data analysis — just like professional software engineers.
