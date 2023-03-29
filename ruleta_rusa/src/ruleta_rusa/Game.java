package ruleta_rusa;

import java.util.ArrayList;

public class Game {
	static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	static Revolver rev = new Revolver();

	public static void main(String[] args) {

		addJugadores();
		ronda();

	}



	static void ronda() {
		int contadorRonda = 0;
		boolean finalDeJuego=false;

		while (contadorRonda < jugadores.size() && !finalDeJuego ){
			jugadores.get(contadorRonda).jugar(rev);
			finalDeJuego=finalDeJuego(jugadores.get(contadorRonda));
			System.out.println(jugadores.get(contadorRonda));
			contadorRonda++;

		} 

	}

	static void addJugadores() {
		Jugador jug1 = new Jugador("Erast", "Crazy Russian");
		Jugador jug2 = new Jugador("James", "The Rock");
		Jugador jug3 = new Jugador("Hans", "Fluegiegieinhainen");
		Jugador jug4 = new Jugador("Fransoir", "Gran Croissant");
		Jugador jug5 = new Jugador("John", "Red Corn");
		Jugador jug6 = new Jugador("Kim Che Svong", "Fat Boy");

		jugadores.add(jug1);
		jugadores.add(jug2);
		jugadores.add(jug3);
		jugadores.add(jug4);
		jugadores.add(jug5);
		jugadores.add(jug6);

	}
	
	static boolean finalDeJuego(Jugador jugador) {

		return !jugador.getVivo();
	}
}
