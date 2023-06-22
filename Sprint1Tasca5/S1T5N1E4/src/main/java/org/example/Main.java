package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        File file = new File("C:\\Users\\Public\\Documents\\ProjectesKirill\\" +
                "Sprint1Tasca5\\S1T5N1E4\\src\\main\\FileForReading");


        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
                                                                            // Con Scanner
        System.out.println("\n--------------------\n");
                                                                            // Con BufferReader

        try {
            FileReader fr = new FileReader("C:\\Users\\Public\\Documents\\ProjectesKirill\\" +
                    "Sprint1Tasca5\\S1T5N1E4\\src\\main\\FileForReading");
            BufferedReader br = new BufferedReader(fr);

            String varLine= br.readLine();

            while (varLine!=null){
                System.out.println(varLine);
                varLine= br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}