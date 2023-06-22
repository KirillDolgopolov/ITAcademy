package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File fileForWrite = new File("result.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileForWrite, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ListOfFiles.readFilesOfDirectory("C:\\Users\\formacio\\Downloads\\demo", 0, bufferedWriter);
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}