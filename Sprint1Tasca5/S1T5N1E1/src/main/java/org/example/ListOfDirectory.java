package org.example;
        import java.io.File;
        import java.util.Arrays;

public class ListOfDirectory {

    public static void readFilesOfDirectory(String dirPath) {
        File directoryFile = new File(dirPath);
        String[] files = directoryFile.list();
        Arrays.sort(files);

        for (String s : files) {
            System.out.println(s);
        }

    }
}
