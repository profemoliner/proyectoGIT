package ejemplo1;

public class Lista {
	private Alumnado[] listaAlumno;
	private int numeroAlumnos;

	/* Constructor */
	/* con un parametro */
	public Lista(int a) {
		listaAlumno = new Alumnado[a];
		numeroAlumnos = 0;
	}

	/* Añadir un alumno a la lista */
	/* Hay que pasar un objeto alumno */
	public void añadirAlumno(Alumnado a) {
		listaAlumno[numeroAlumnos] = a;
		numeroAlumnos++;
	}

	/* Borrar alumno */
	public void borrarAlumno(String a) {
		int posicion;
		posicion = buscarAlumno(a);
		for (int i = posicion; i < numeroAlumnos - 1; i++) {
			listaAlumno[i] = listaAlumno[i + 1];
		}
		numeroAlumnos--;
	}

	/* Buscar a un alumno en la lista */
	public int buscarAlumno(String a) {
		int c = -1;
		for (int i = 0; i < numeroAlumnos; i++) {
			if (a.equals(listaAlumno[i].getNombre())) {
				c = i;
				break;
			}
		}
		return c;
	}

	public Alumnado[] getListaAlumno() {
		return listaAlumno;
	}

	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}
}
