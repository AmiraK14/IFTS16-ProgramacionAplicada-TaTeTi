package miTaTeTi;
import java.util.Scanner;

public abstract class Jugador {
	public String nombre;
	public String tipoFicha;
	public Ubicacion ubicacionElegida;
	Scanner lector = new Scanner(System.in);
	public int puntos = 0;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getTipoFicha() {
		return this.tipoFicha;
	}
	
	
	public int getPuntos() {
		return this.puntos;
	}
	
	public Ubicacion elegirUbicacionFicha() {
		System.out.println(this.nombre + " ingrese la fila donde desea colocar su ficha: ");
		int fila = Integer.parseInt(lector.nextLine());
		fila = verificarUbicacionValida(fila, "fila");
		//System.out.println("***************LA FILA ES: "+fila);
		System.out.println(this.nombre + " ingrese la columna donde desea colocar su ficha: ");
		int columna = Integer.parseInt(lector.nextLine());
		columna = verificarUbicacionValida(columna, "columna");
		ubicacionElegida = new Ubicacion(fila,columna);
		return ubicacionElegida;
	}

	public int verificarUbicacionValida(int ubicacion, String tipoUbicacion) {
		 while (ubicacion>2 || ubicacion<0) {
			System.out.println("La ubicacion seleccionada debe estar entre los valores 0 y 2. Intentelo nuevamente");
			System.out.println(this.nombre + " ingrese la "+tipoUbicacion+" donde desea colocar su ficha: ");
			ubicacion = Integer.parseInt(lector.nextLine());
		}
		 return ubicacion;
	}
	
	public void mensajeGanador() {
		System.out.println("******* "+this.nombre+" GANASTE!!! *******");
		sumarPuntos();
		System.out.println("Acumulas un total de "+this.puntos+ " puntos\n");
	}
	
	public void sumarPuntos() {
		puntos++;
	}
	
	public void mostrarPuntosFinales() {
		System.out.println(this.nombre+": "+this.puntos+" puntos");
	}
}
