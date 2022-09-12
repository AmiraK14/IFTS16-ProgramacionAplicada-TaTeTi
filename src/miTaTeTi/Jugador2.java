package miTaTeTi;

public class Jugador2 extends Jugador{
	public String nombre;
	public String tipoFicha;
	
	public Jugador2(String nombre) {
		super(nombre);
		this.tipoFicha = "0";
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getTipoFicha() {
		return this.tipoFicha;
	}
	
	public Ubicacion elegirUbicacionFicha() {
		System.out.println("\nEs el turno de la computadora!");
		//System.out.println(this.nombre + " ingrese la fila donde desea colocar su ficha: ");
		int fila = (int)(Math.random()*(3-0)+0);
		System.out.println("Fila: "+fila);
		fila = verificarUbicacionValida(fila, "fila");
		//System.out.println("Fila elegida por la computadora: "+fila);
		//System.out.println("***************LA FILA ES: "+fila);
		//System.out.println(this.nombre + " ingrese la columna donde desea colocar su ficha: ");
		int columna = (int)(Math.random()*(3-0)+0);
		columna = verificarUbicacionValida(columna, "columna");
		System.out.println("Columna: "+columna);
		ubicacionElegida = new Ubicacion(fila,columna);
		return ubicacionElegida;
	}
	
	public int verificarUbicacionValida(int ubicacion, String tipoUbicacion) {
		 while (ubicacion>2 || ubicacion<0) {
			ubicacion = Integer.parseInt(lector.nextLine());
		}
		 return ubicacion;
	}
	
	public void mensajeGanador() {
		System.out.println("******* GANO LA COMPUTADORA *******");
		sumarPuntos();
		System.out.println("Computadora acumula un total de "+this.puntos+ " puntos\n");
	}
}
