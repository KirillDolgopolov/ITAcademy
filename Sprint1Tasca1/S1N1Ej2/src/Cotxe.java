public class Cotxe {
    static final String marca ="SEAT";
    static String model="Ibiza";
   private final int potencia;

    public Cotxe(int potencia) {
        this.potencia = potencia;
    }



    public int getPotencia() {
        return potencia;
    }

    public static void frenar(){
    System.out.println("El vehicle està frenant");
}

public void accelerar(){
    System.out.println("El vehicle està accelerant");
}



}
