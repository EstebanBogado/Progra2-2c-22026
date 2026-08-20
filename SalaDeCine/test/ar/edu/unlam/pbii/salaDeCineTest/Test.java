package ar.edu.unlam.pbii.salaDeCineTest;

import ar.edu.unlam.pbii.salaDeCine.Butaca;
import ar.edu.unlam.pbii.salaDeCine.Genero;
import ar.edu.unlam.pbii.salaDeCine.Pelicula;
import ar.edu.unlam.pbii.salaDeCine.SalaDeCine;

public class Test {

	public static void imprimirButacas(Butaca[][] butacas) {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[0].length; j++) {
				System.out.print(butacas[i][j] + " ");
			}
			System.out.println("");

		}
	}

	public static void mensajeDeVenta(Boolean sePudo) {
		if (sePudo) {
			System.out.println("Tiene la edad correcta");
		} else {
			System.out.println("No tiene la edad correcta");
		}
	}

	public static void main(String[] args) {
		SalaDeCine sala = new SalaDeCine(6, 5);
		Pelicula starWars = new Pelicula("Star Wars", Genero.SUSPENSO, 180, 16);
		Pelicula toyStory5 = new Pelicula("Toy Story 5", Genero.INFANTIL, 90, 0);

		sala.proyectarPelicula(starWars);
		
		mensajeDeVenta(sala.venderBoleto(0, 0, 17));
		imprimirButacas(sala.getEstadoButacas());
		
		mensajeDeVenta(sala.venderBoleto(0, 0, 17));
		imprimirButacas(sala.getEstadoButacas());
		
		mensajeDeVenta(sala.venderBoleto(1, 1, 17));
		imprimirButacas(sala.getEstadoButacas());
		
		mensajeDeVenta(sala.venderBoleto(5, 4, 17));
		imprimirButacas(sala.getEstadoButacas());
		
		mensajeDeVenta(sala.venderBoleto(4, 4, 17));
		imprimirButacas(sala.getEstadoButacas());

	}

}
