import java.util.ArrayList;

public class Venda {

    ArrayList<Product> productos = new ArrayList<>();

    double preuTotal=0;

    void calcularTotal()  {
        if (productos.size()==0){
            try {
                throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
            } catch (VendaBuidaException e) {
                System.out.println(e.getMessage());;
            }
        } else {
            for (int i=0; i<productos.size();i++){
                preuTotal+=productos.get(i).getPreu();
            }
        }
    }


}
