package miTaTeTi;
import java.util.Scanner;


public class Inicializador {
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("**********************************************");
		System.out.println("******* BIENVENIDO AL TA-TE-TI VIRTUAL *******");
		System.out.println("**********************************************\n");
		System.out.println("Ingrese su nombre: ");
		String nombre = lector.nextLine();
		Jugador jugador1 = new Jugador1(nombre);
		System.out.println("Bienvenid@ "+nombre + ". Usted usará las CRUCES (X)\n");
		
		//System.out.println("Jugador 2, ingrese su nombre: ");
		//nombre = lector.nextLine();
		Jugador jugador2 = new Jugador2("Computadora");
		//System.out.println("Bienvenid@ "+nombre + ". Usted usará los CIRCULOS (0)\n");
		
		System.out.println("Deberá ingresar un valor entre 0 y 2 para elegir la fila y columna de la casilla elegida");
		System.out.println("Que empiece el juego!!");
		
		
		//int contadorJugadas = 0;
		int jugadorActual;
		boolean jugadaEfectuada;
		//boolean hayCoincidencia = false;
		Tablero primerTablero = new Tablero();
		String jugarNuevamente;
		
		//primerTablero.crearTablero();
		//primerTablero.mostrarTablero();
		do {
			primerTablero.crearTablero();
			int contadorJugadas = 0;
			boolean hayCoincidencia = false;
			while (contadorJugadas < 9 && hayCoincidencia==false) {
				primerTablero.mostrarTablero();
				if (contadorJugadas%2==0) {
					jugadorActual = 1;
					jugadaEfectuada = primerTablero.colocarFicha(jugador1.elegirUbicacionFicha(), jugador1.getTipoFicha());
				} else {
					jugadorActual = 2;
					jugadaEfectuada = primerTablero.colocarFicha(jugador2.elegirUbicacionFicha(), jugador2.getTipoFicha());
				}
				if (jugadaEfectuada==true) {
					//System.out.println("Jugada NRO "+contadorJugadas);
					if (contadorJugadas > 3) {
						//System.out.println("HORIZONTAL "+ primerTablero.chequearCoincidenciaHorizontal());
						//System.out.println("VERTICAL "+primerTablero.chequearCoincidenciaVertical());
						//System.out.println("DIAGONAL "+primerTablero.chequearCoincidenciaDiagonal());
						if (primerTablero.chequearCoincidenciaHorizontal() || primerTablero.chequearCoincidenciaVertical() || primerTablero.chequearCoincidenciaDiagonal()) {
							//System.out.println("HAY UN GANADOR");
							hayCoincidencia=true;
							primerTablero.mostrarTablero();
							if (jugadorActual == 1) {
								jugador1.mensajeGanador();
							} else {
								jugador2.mensajeGanador();
							}
						} else {
							contadorJugadas++;
						}
					} else {
						contadorJugadas++;
					}
				}
			}
			if (hayCoincidencia==false) {
				primerTablero.mostrarTablero();
				System.out.println("Es un EMPATE. Partida finalizada");
			}
			System.out.println("Desea iniciar una nueva partida? Presiona S o N");
			jugarNuevamente = lector.nextLine();
			jugarNuevamente = jugarNuevamente.toUpperCase();
		} while (jugarNuevamente.equals("S"));
		System.out.println("\n FIN DEL JUEGO\n");
		System.out.println("******** Resultados finales ********");
		jugador1.mostrarPuntosFinales();
		jugador2.mostrarPuntosFinales();
	}
}
