import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Entrada {

    static Scanner sc = new Scanner(System.in);

    public static byte llegirByte(String missatge) {

        boolean entradaCorrecta = false;
        byte var = 0;

        while (entradaCorrecta == false) {

            try {
                System.out.println(missatge);
                var = sc.nextByte();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                sc.nextLine();
            }
        }

        return var;
    }

    public static int llegirInt(String missatge) {
        boolean entradaCorrecta = false;
        int var = 0;

        while (entradaCorrecta == false) {

            try {
                System.out.println(missatge);
                var = sc.nextInt();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                sc.nextLine();
            }
        }

        return var;
    }

    public static float llegirFloat(String missatge) {
        boolean entradaCorrecta = false;
        float var = 0;

        while (entradaCorrecta == false) {

            try {
                System.out.println(missatge);
                var = sc.nextFloat();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                sc.nextLine();
            }
        }

        return var;
    }


    public static double llegirDouble(String missatge) {
        boolean entradaCorrecta = false;
        double var = 0;

        while (entradaCorrecta == false) {

            try {
                System.out.println(missatge);
                var = sc.nextDouble();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                sc.nextLine();
            }
        }

        return var;
    }

    public static char llegirChar(String missatge) {

        boolean entradaCorrecta = false;
        char var = 0;

        while (entradaCorrecta == false) {


            System.out.println(missatge);
            String varString = sc.nextLine();
            try {
                if ((varString.length() > 1)) {
                    throw new Exception();
                }
                var = varString.charAt(0);
                entradaCorrecta = true;

            } catch (Exception e) {
                System.out.println("Es muy largo para un char");
            }


        }
        return var;
    }

    public static String llegirString(String missatge) {
        boolean entradaCorrecta = false;
        String var = null;

        while (entradaCorrecta == false) {

            System.out.println(missatge);
            var = sc.nextLine();
            try {
                if (var.length() <= 1) {
                    throw new Exception();
                }
                entradaCorrecta = true;
            } catch (Exception e) {
                System.out.println("Es muy corto para un String");
            }


        }
        return var;
    }


    public static boolean llegirSiNo(String missatge) {
        boolean entradaCorrecta = false;
        boolean var = true;

        while (entradaCorrecta == false) {

            try {
                System.out.println(missatge);
                String leerScanner = sc.nextLine();
                leerScanner=leerScanner.toLowerCase();
                char varChar = leerScanner.charAt(0);
                if (varChar == 's') {
                    var = true;
                    entradaCorrecta= true;
                } else if (varChar=='n') {
                    var = false;
                    entradaCorrecta= true;
                } else throw new Exception();

            } catch (Exception e) {
                System.out.println("Error de format");
            }
        }
        return var;
    }

}
