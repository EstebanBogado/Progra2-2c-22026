package ar.edu.unlam.pbii.salaDeCine;

public class SalaDeCine {

	Butaca[][] butacas;
	Pelicula pelicula;

	public SalaDeCine(Integer filas, Integer columnas) {
		this.butacas = new Butaca[filas][columnas];

		for (int i = 0; i <= filas; i++) {
			for (int j = 0; j <= columnas; j++) {
				this.butacas[i][j] = new Butaca();
			}
		}
	}

	public void proyectarPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Pelicula getPelicula() {
		return this.pelicula;
	}

	public Butaca[][] getEstadoButacas() {
		return this.butacas;
	}

	public Boolean venderBoleto(Integer fila, Integer columna, Integer edad) {
		if (this.butacas[fila][columna].getEstadoButaca())
			return false;
		if (pelicula.puedeVerla(edad))
			return false;

		this.butacas[fila][columna].ocupar();
		return this.butacas[fila][columna].getEstadoButaca();
	}

}
