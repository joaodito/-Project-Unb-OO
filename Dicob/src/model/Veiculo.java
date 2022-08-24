package model;

public class Veiculo {
	
	private String proprietario;
	private String placa;
	private int desempenho;
	private String tipoDeConsumo;	
	
	
	public Veiculo(String proprietario, String placa, int desempenho, String tipoDeConsumo){
		this.proprietario = proprietario;
		this.placa = placa;
		this.desempenho = desempenho;
		this.tipoDeConsumo = tipoDeConsumo;	
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getDesempenho() {
		return desempenho;
	}


	public void setDesempenho(int desempenho) {
		this.desempenho = desempenho;
	}


	public String getTipoDeConsumo() {
		return tipoDeConsumo;
	}


	public void setTipoDeConsumo(String tipoDeConsumo) {
		this.tipoDeConsumo = tipoDeConsumo;
	}
	
}

	
