import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        HashSet<Restaurante> restaurantes = new HashSet<>();

        Restaurante rest1 = new Restaurante("Little Jamaica", 7);
        Restaurante rest2 = new Restaurante("Passadis catalan", 6);
        Restaurante rest3 = new Restaurante("Bar Pepe", 4);
        Restaurante rest4 = new Restaurante("Bar Pepe", 5);

        restaurantes.add(rest1);
        restaurantes.add(rest2);
        restaurantes.add(rest3);
        restaurantes.add(rest4);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String varNombre;
            Integer varPunt;
            System.out.println("Introduzca el nombre de nuevo restaurante");
            varNombre = scanner.nextLine();
            System.out.println("Introduzca su puntuación");
            varPunt = scanner.nextInt();
            scanner.nextLine();
            Restaurante varRest = new Restaurante(varNombre, varPunt);

            boolean tenemosRest=false;
            for (Restaurante r: restaurantes){
                if (r.compareTo(varRest)==0){
                    System.out.println("Ya tenemos este restaurante");
                tenemosRest=true;
                }
            }

            if (!tenemosRest){
                restaurantes.add(varRest);
            }
        }



        for (Restaurante r: restaurantes){
            System.out.println(r);
        }

    }
}
