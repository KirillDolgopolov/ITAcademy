public class Main {
    public static void main(String[] args)
    {       InstrumentDeCorda guitarra = new InstrumentDeCorda("Gibson Les Poul", 1200.99F);
        InstrumentDeVent sax = new InstrumentDeVent("Salomon", 980.00F);
        InstrumentDePercussio bateria = new InstrumentDePercussio("BateriaNoName", 3499.00F);

        guitarra.tocar();
        sax.tocar();
        bateria.tocar();

        System.out.println(guitarra);
        System.out.println(sax);
        System.out.println(bateria);

    }
}