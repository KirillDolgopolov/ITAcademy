import org.w3c.dom.ls.LSOutput;

public class InstrumentDeVent extends Instrument{

    public InstrumentDeVent(String nom, float preu) {
        super(nom, preu);
    }



    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");

    }
}
