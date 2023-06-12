public class Main {
    public static void main(String[] args) {

        Cotxe miCotxe = new Cotxe(95);

        miCotxe.accelerar();
        Cotxe.frenar();

        System.out.println(Cotxe.marca);
        System.out.println(Cotxe.model);

        Cotxe.model = "Toledo";
        System.out.println(Cotxe.model);

        System.out.println(miCotxe.getPotencia());

    }
}
