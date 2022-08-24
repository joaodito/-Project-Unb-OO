package model;

public class Combustivel {
	
	private double precoCombustivel;
	private String tipoDeCombustivel;

	public Combustivel(double precoCombustivel, String tipoDeCombustivel){
		this.precoCombustivel = precoCombustivel;
		this.tipoDeCombustivel = tipoDeCombustivel;
	}

	public double getPrecoCombustivel() {
		return precoCombustivel;
	}

	public void setPrecoCombustivel(double precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}

	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}

	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
}


