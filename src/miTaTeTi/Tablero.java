package miTaTeTi;

public class Tablero {
public String Tablero [][] = new String [3][3];
	
	public void crearTablero() {
		for (int i=0; i<Tablero.length;i++) {
			for (int j=0; j<Tablero[i].length;j++) {
				Tablero[i][j] = "-";
			}
		}
	}
	
	public void mostrarTablero(){
		System.out.println();
		for (int i=0; i<Tablero.length;i++) {
			for (int j=0; j<Tablero[i].length;j++) {
				System.out.print(Tablero[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println();
	}
	
	public boolean colocarFicha(Ubicacion ubicacion, String ficha) {
		boolean sePudoColocarFicha;
		if (Tablero[ubicacion.getUbicacionFila()][ubicacion.getUbicacionColumna()]=="-") {
			Tablero[ubicacion.getUbicacionFila()][ubicacion.getUbicacionColumna()]=ficha;
			sePudoColocarFicha=true;
		} else {
			System.out.println("Ubicacion ocupada. Intentelo nuevamente.");
			sePudoColocarFicha=false;
		}
		return sePudoColocarFicha;
	}
	
	
	public boolean chequearCoincidenciaHorizontal(){
		boolean coincidenciaHorizontal = false;
		if (!Tablero[0][0].equals("-") && Tablero[0][0] == Tablero[0][1] && Tablero[0][1] == Tablero[0][2]) {
			coincidenciaHorizontal = true;
		} else if (!Tablero[1][0].equals("-") && Tablero[1][0] == Tablero[1][1] && Tablero[1][1] == Tablero[1][2]) {
			coincidenciaHorizontal = true;
		} else if (!Tablero[2][0].equals("-") && Tablero[2][0] == Tablero[2][1] && Tablero[2][1] == Tablero[2][2]) {
			coincidenciaHorizontal = true;
		}
		return coincidenciaHorizontal;
	}
	
	public boolean chequearCoincidenciaVertical(){
		boolean coincidenciaVertical=false;
		if (!Tablero[0][0].equals("-") && Tablero[0][0] == Tablero[1][0] && Tablero[1][0] == Tablero[2][0]) {
			coincidenciaVertical = true;
		} else if (!Tablero[0][1].equals("-") && Tablero[0][1] == Tablero[1][1] && Tablero[1][1] == Tablero[2][1]) {
			coincidenciaVertical = true;
		} else if (!Tablero[0][2].equals("-") && Tablero[0][2] == Tablero[1][2] && Tablero[1][2] == Tablero[2][2]) {
			coincidenciaVertical = true;
		}
		return coincidenciaVertical;
	}
	
	public boolean chequearCoincidenciaDiagonal(){
		boolean coincidenciaDiagonal=false;
		if (!Tablero[0][0].equals("-") && Tablero[0][0] == Tablero[1][1] && Tablero[1][1] == Tablero[2][2]) {
			coincidenciaDiagonal=true;
		} else if (!Tablero[0][2].equals("-") && Tablero[0][2] == Tablero[1][1] && Tablero[1][1] == Tablero[2][0]) {
			coincidenciaDiagonal=true;
		}
		return coincidenciaDiagonal;
	}
}

