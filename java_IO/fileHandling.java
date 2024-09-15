/*
    * File class is used for created file or to choose file.
   * 
 * file reader is old ways to handle file because once program is closed everything that is written vainshes
 * 
 * so , buffer reader is used with file reader to keep changes permanent
 */

import java.nio.Buffer;

import java.io.*;
import java.io.*;

public class fileHandling {
    public static void main(String[] args) throws Exception {
        File f = new File("./Abstract.txt");
        // to deleteFile

        // create new File
        if (f.createNewFile()) {
            System.out.println("file Created : " + f.getName());
        } else {
            System.out.println("file already exist : " + f.getName());
        }

        // FileWriter fw = new FileWriter(f);
        // BufferedWriter bw = new BufferedWriter(fw);

        BufferedWriter writer = new BufferedWriter(new FileWriter(f));
        // Write the first paragraph
        writer.write("This is the first paragraph. It contains some text.");

        // Write a new line to separate paragraphs
        writer.newLine();

        // Write the second paragraph
        writer.write("This is the second paragraph. It continues the discussion.");

        // You can continue adding more paragraphs as needed

        System.out.println("Content written to the file successfully!");

        writer.close();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close(); // Close the BufferedReader

    }
}
