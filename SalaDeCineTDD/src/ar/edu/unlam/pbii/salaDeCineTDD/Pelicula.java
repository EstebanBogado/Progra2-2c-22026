package ar.edu.unlam.pbii.salaDeCineTDD;

public class Pelicula {
	private String titulo;
	private Integer duracion;
	private Integer edadMinima;
	private Tipo categoria;

	public Pelicula(String titulo, Integer duracion, Integer edadMinima, Tipo categoria) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo= " + titulo + ", duracion= " + duracion + ", edadMinima= " + edadMinima
				+ ", categoria= " + categoria + "]";
	}

	public Integer getEdadMinima() {
		// TODO Auto-generated method stub
		return this.edadMinima;
	}

}
