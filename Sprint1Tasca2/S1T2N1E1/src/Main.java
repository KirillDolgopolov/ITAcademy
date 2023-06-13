public class Main {
    public static void main(String[] args) throws VendaBuidaException, ArrayIndexOutOfBoundsException {


        Venda venda1 = new Venda();
        venda1.calcularTotal(); //throw exception VendaBuidaExeption



        int suma = 0;   //Escric el codi necessari per a generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException
        for (int i = 0; i <= venda1.productos.size(); i++) {
            try {
                suma += venda1.productos.get(i).getPreu();
            } catch (Exception e) {
                System.out.println("Fuera de lista");
            }
        }
    }
}
