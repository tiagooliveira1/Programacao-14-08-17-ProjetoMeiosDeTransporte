package opet.aulatds.veiculos;

public class Carro {
	
	private String cor = "";
	private int ano = 0;
	private String marca = "";
	private String fabricante = "";
	
	public Carro(String cor, int ano) {
		this.cor = cor;
		this.ano = ano;
	}
	
	public Carro() {
		
	}
	

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getFabricante() {
		return fabricante;
	}



	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	

}
