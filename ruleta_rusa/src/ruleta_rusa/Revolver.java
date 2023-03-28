package ruleta_rusa;

public class Revolver {
	private int posicionActual;
	private int posicionBala;

	public boolean disparar() {
		boolean disparo = false;
		posicionActual = (int) (Math.random() * 6) + 1;
		posicionBala = (int) (Math.random() * 6) + 1;
		if (posicionActual == posicionBala) {
			System.out.println("BAJ!!!!");
			disparo = true;
		} else {
			System.out.println("chik");
		}
		return disparo;
	}

	public boolean siguienteBala() {
		boolean disparo = false;
		posicionActual++;
		if (posicionActual == 7) {
			posicionActual = 1;
		}
		if (posicionActual == posicionBala) {
			System.out.println("BAJ!!!!");
			disparo = true;
		} else {
			System.out.println("chik");
		}
		return disparo;
	}

	public void informar() {
		System.out.println("Posición actual: " + posicionActual + "\nPosición bala: " + posicionBala);

	}

}
