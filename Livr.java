import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Livr {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            // Initialize the Scanner object to read from standard input
            scanner = new Scanner(System.in);

            // Read input from the user
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");

            // Read input from a file
            scanner = new Scanner(new File("file.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Process each line of input
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

