import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileWithLoop {
    public static void main(String[] args) {
        File file = new File("./output.txt"); // Specify the file path

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            Scanner scanner = new Scanner(System.in);

            // Loop to take user input for paragraphs
            while (true) {
                System.out.println("Enter a paragraph (type 'exit' to finish):");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    break; // Exit the loop if the user types 'exit'
                }

                writer.write(input);
                writer.newLine();
            }

            System.out.println("Content written to the file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
