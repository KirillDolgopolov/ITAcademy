package tS1N1E1;

public class Ejercicio1 {

	public static void main(String[] args) {

		InstrumentDeCorda gt1 = new InstrumentDeCorda("Fender", 349.99f);
		InstrumentDePercucio tamb1 = new InstrumentDePercucio("Solomon", 25f);
		InstrumentDeVent sx1 = new InstrumentDeVent("Gold Sax", 990f);

		gt1.tocar();
		tamb1.tocar();
		sx1.tocar();

	}

}
