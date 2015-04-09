package ejemplo1;

public class Profesor {

	private String nomProfesor;
	private String apeProfesor;
	
	/**
	 * @param nomProfesor
	 * @param apeProfesor
	 */
	public Profesor(String nomProfesor, String apeProfesor) {
		super();
		this.nomProfesor = nomProfesor;
		this.apeProfesor = apeProfesor;
	}
	/**
	 * @return el nomProfesor
	 */
	public String getNomProfesor() {
		return nomProfesor;
	}
	/**
	 * @return el apeProfesor
	 */
	public String getApeProfesor() {
		return apeProfesor;
	}
	
	
	
}
