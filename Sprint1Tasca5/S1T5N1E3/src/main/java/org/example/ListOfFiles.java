package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class ListOfFiles {


    public static void readFilesOfDirectory(String dirPath, int level, BufferedWriter bufferedWriter) {
        File file = new File(dirPath);

        try {

            if (file.isFile()) {
                bufferedWriter.write(" ".repeat(level) + "L__ " + "(F) " + file.getName() + " | Date of last change: " + new Date(file.lastModified()));
                bufferedWriter.newLine();

                System.out.println(" ".repeat(level) + "L__ " + "(F) " + file.getName() + " | Date of last change: " + new Date(file.lastModified()));
            } else if (file.isDirectory()) {
                bufferedWriter.write(" ".repeat(level) + "L__ " + "(D) " + file.getName() + " | Date of last change: " + new Date(file.lastModified()));
                bufferedWriter.newLine();
                
                System.out.println(" ".repeat(level) + "L__ " + "(D) " + file.getName() + " | Date of last change: " + new Date(file.lastModified()));
                File[] files = file.listFiles();
                Arrays.sort(files);

                for (File s : files) {
                    readFilesOfDirectory(s.getPath(), level + 1, bufferedWriter);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
