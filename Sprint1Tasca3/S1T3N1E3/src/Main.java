import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<String, String>();

        File fileCountries = new File("countries.txt");

        try {
            Scanner scanner = new Scanner(fileCountries);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lines = line.split(" ");
                countries.put(lines[0], lines[1]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        }


        String nameOfGamer;
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca tu nombre, gamer!");
        nameOfGamer = scanner.nextLine();
        ArrayList<String> keys = new ArrayList<>(countries.keySet());

        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * countries.size());
            System.out.println("Introduzca la capital de: " + keys.get(randomNumber));
            String tecladoCountry = scanner.nextLine();
            if (tecladoCountry.equalsIgnoreCase(countries.get(keys.get(randomNumber)))) {
                score++;
            }
        }

        File writer = new File("classificacio.txt");
        try {
            PrintWriter pw = new PrintWriter(writer);
            pw.printf("Gamer " + nameOfGamer + " ha ganado " + score + " puntos!"+"%n");
           // pw.println("Gamer " + nameOfGamer + " ha ganado " + score + " puntos!");
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file to write");
        }
        scanner.close();
    }
}