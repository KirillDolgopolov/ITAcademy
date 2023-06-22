package org.example;

import java.io.File;
import java.util.Arrays;
import java.util.Date;


public class ListOfFiles {

    public static void readFilesOfDirectory(String dirPath, int level) {
        File file = new File(dirPath);

        if (file.isFile()) {
            System.out.println(" ".repeat(level) + "L__ " + "(F) " + file.getName() + " | Date of last change: " + new Date(file.lastModified()));
        } else if (file.isDirectory()) {
            System.out.println(" ".repeat(level) + "L__ " + "(D) " + file.getName() + " | Date of last change: " + new Date(file.lastModified()));
            File[] files = file.listFiles();
            Arrays.sort(files);

            for (File s : files) {
                readFilesOfDirectory(s.getPath(), level + 1);
            }
        }
    }
}