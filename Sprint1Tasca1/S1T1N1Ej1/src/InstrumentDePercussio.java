public class InstrumentDePercussio extends Instrument{
    public InstrumentDePercussio(String nom, float preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");

    }
}
