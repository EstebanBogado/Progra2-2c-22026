package ar.edu.unlam.pbii.empresaTransporteTest;

import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unlam.pbii.empresaTransporte.Bicicleta;
import ar.edu.unlam.pbii.empresaTransporte.Paquete;
import ar.edu.unlam.pbii.empresaTransporte.Vehiculo;

class Test {

	@org.junit.jupiter.api.Test
	void crearUnVehículoDeTransporteYQueNoSeaNull() {
		Vehiculo bicicleta = new Bicicleta(15.0, 0.125);

		assertNotNull(bicicleta);
	}

	@org.junit.jupiter.api.Test
	void crearUnaBicicletaDeTransporteYQueValideSiLaCargaMaximaEsValida() {
		Integer valorEsperado = 2;
		Vehiculo bicicleta = new Bicicleta(15.0, 0.125);
		((Bicicleta) bicicleta).setDestinoInicial("castelar");
		Paquete paquete1 = new Paquete(65.0, 0.075);
		paquete1.setDestino("Ramos Mejía");
		Paquete paquete2 = new Paquete(4.0, 0.04);
		paquete2.setDestino("Castelar");
		Paquete paquete3 = new Paquete(8.0, 0.05);
		paquete3.setDestino("Morón");
		Paquete paquete4 = new Paquete(8.0, 0.07, "casteLAR");

		bicicleta.setCarga(paquete1);
		bicicleta.setCarga(paquete2);
		bicicleta.setCarga(paquete3);
		bicicleta.setCarga(paquete4);

		((Bicicleta) bicicleta).listarPaquetes();

		assertEquals(Integer.valueOf(valorEsperado), bicicleta.cantPaquetes());

	}

	@org.junit.jupiter.api.Test
	void crearUnaBicicletaDeTransporteYValidarQueElDestinoDeLasCargasSeaElMismo() {
		Integer valorEsperado = 2;
		Vehiculo bicicleta = new Bicicleta(15.0, 0.125);
		((Bicicleta) bicicleta).setDestinoInicial("haedo");
		Paquete paquete1 = new Paquete(5.0, 0.075, "Haedo");
		Paquete paquete2 = new Paquete(6.0, 0.04);
		paquete2.setDestino("San Justo");
		Paquete paquete3 = new Paquete(8.0, 0.05);
		paquete3.setDestino("Haedo");

		bicicleta.setCarga(paquete1);
		bicicleta.setCarga(paquete2);
		bicicleta.setCarga(paquete3);

		((Bicicleta) bicicleta).listarPaquetes();

		assertEquals(Integer.valueOf(valorEsperado), bicicleta.cantPaquetes());

	}
}
