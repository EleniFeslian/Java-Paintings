# Java-Paintings
This Java program simulates an auction for artworks, including paintings and sculptures. Each artwork is randomly generated with specific attributes such as creator, year, condition, and artistic movement. The program then evaluates which artworks meet user-specified criteria and displays the auction results.

## Features
- Abstract class **Artifact** representing a general artwork. 
- **Masterpiece** subclass for refined artworks with additional properties.  
- **Painting** and **Sculpture** subclasses with unique attributes (dimensions, technique, material, etc.).
-   Randomized creation of artwork attributes for a realistic auction scenario.
-   Evaluation function to filter and display eligible artworks based on user criteria.

## Project Structure
- **Artifact.java**  
  - An abstract base class representing a general artwork.  
  - Defines common properties like title, artist, and year.  

- **Masterpiece.java**  
  - An abstract subclass of `Artifact` that introduces condition and artistic movement.  

- **Painting.java**  
  - A concrete subclass representing paintings with additional attributes like medium and style.  

- **Sculpture.java**  
  - A concrete subclass representing sculptures, including material and dimensions.  

- **Main.java**  
  - Handles the main execution of the program, including auction logic and artwork management.  

## How to Run
### Compilation
- Compile the source files by running:`javac *.java`
- Run the program using: `java Main <N> <condition> <movement>` where:
  - N: Number of artworks to generate (positive integer)
  - condition: Acceptable artwork condition (e.g., "good", "bad", "excellent")
  - movement: Artistic movement (e.g., "naturalism", "expressionism", "impressionism")
