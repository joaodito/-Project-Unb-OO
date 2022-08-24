package model;

public class Trajeto {

	private String inicio;
	private String destino;
	private double quilometroPecorrido;
	private boolean modoDeTrajeto;
	private double consumoDoTrajeto;
	
	public Trajeto(String inicio, String destino, double quilometroPecorrido, boolean modoDeTrajeto, double consumoDoTrajeto){
		this.inicio = inicio;
		this.destino = destino;
		this.quilometroPecorrido = quilometroPecorrido;
		this.modoDeTrajeto = modoDeTrajeto;
		this.consumoDoTrajeto = consumoDoTrajeto;
	}
	
	public void modoDeTrajeto() {
		if (modoDeTrajeto == true) {
		consumoDoTrajeto = 1.0;
		} else { 
		consumoDoTrajeto = 1.5;
		}
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getQuilometroPecorrido() {
		return quilometroPecorrido;
	}

	public void setQuilometroPecorrido(double quilometroPecorrido) {
		this.quilometroPecorrido = quilometroPecorrido;
	}

	public boolean isModoDeTrajeto() {
		return modoDeTrajeto;
	}

	public void setModoDeTrajeto(boolean modoDeTrajeto) {
		this.modoDeTrajeto = modoDeTrajeto;
	}

	public double getConsumoDoTrajeto() {
		return consumoDoTrajeto;
	}

	public void setConsumoDoTrajeto(double consumoDoTrajeto) {
		this.consumoDoTrajeto = consumoDoTrajeto;
	}
	
}
