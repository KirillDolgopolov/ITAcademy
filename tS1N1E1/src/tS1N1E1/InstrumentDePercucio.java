package tS1N1E1;

public class InstrumentDePercucio extends Instrument {

	public InstrumentDePercucio(String name, float preu) {
		super(name, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");

	}

}
