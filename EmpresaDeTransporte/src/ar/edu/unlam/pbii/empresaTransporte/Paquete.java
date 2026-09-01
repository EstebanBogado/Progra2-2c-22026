package ar.edu.unlam.pbii.empresaTransporte;

public class Paquete {
	private Double peso;
	private Double volumen;
	private String destino;

	public Paquete(Double peso, Double volumen, String destino) {
		this.peso = peso;
		this.volumen = volumen;
		this.destino = destino;
	}

	public Double getPeso() {
		return this.peso;
	}

	public Double getVolumen() {
		return this.volumen;
	}

	@Override
	public String toString() {
		return "[peso= " + peso + "kg" + ", volumen= " + volumen + "m³" + "destino= " + destino.toUpperCase() + "]";
	}

	public String getDestino() {
		return this.destino;
	}

}
