package miTaTeTi;

public class Jugador1 extends Jugador {
	public String nombre;
	public String tipoFicha;
	
	public Jugador1(String nombre) {
		super(nombre);
		this.tipoFicha = "X";
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getTipoFicha() {
		return this.tipoFicha;
	}
}
