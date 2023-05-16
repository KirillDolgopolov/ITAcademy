package tS1N1E1;

public class InstrumentDeVent extends Instrument {

	public InstrumentDeVent(String name, float preu) {
		super(name, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");

	}

}
