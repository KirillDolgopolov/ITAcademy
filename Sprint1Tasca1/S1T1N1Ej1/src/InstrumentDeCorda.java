public class InstrumentDeCorda  extends Instrument{


    public InstrumentDeCorda(String nom, float preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
