import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Restaurante rest1 = new Restaurante("Little Jamaica", 7);
        Restaurante rest2 = new Restaurante("Passadis catalan", 6);
        Restaurante rest3 = new Restaurante("Bar Pepe", 4);
        Restaurante rest4 = new Restaurante("Bar Pepe", 5);

        ArrayList <Restaurante> restaurantes = new ArrayList<>();

        restaurantes.add(rest1);
        restaurantes.add(rest2);
        restaurantes.add(rest3);
        restaurantes.add(rest4);


        Collections.sort(restaurantes);
        for (Restaurante r: restaurantes){
            System.out.println(r);
        }

    }
}