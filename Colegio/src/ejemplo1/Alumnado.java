package ejemplo1;

public class Alumnado {
	/* Constructor */
	protected String nombre;
	protected int edad;
	protected String apellido;

	public Alumnado(String a, int b) {
		nombre = a;
		edad = b;
	}
	
	public Alumnado(String a, int b,String ap) {
		nombre = a;
		edad = b;
		apellido = ap;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
}