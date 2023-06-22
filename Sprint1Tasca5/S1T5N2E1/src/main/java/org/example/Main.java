package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("configuration.txt");

        try {
            Scanner scanner = new Scanner(file);
            String outFilePath = scanner.nextLine();
            String pathOfDirectoryForRead = scanner.nextLine();

            System.out.println(outFilePath);
            System.out.println(pathOfDirectoryForRead);


            File fileForWrite = new File(outFilePath);
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(fileForWrite, true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


            ListOfFiles.readFilesOfDirectory(pathOfDirectoryForRead, 0, bufferedWriter);

            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}