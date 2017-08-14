package opet.aulatds.veiculos;

public class Trem {

	private Vagao[] vagoes;
	
	public Trem() {
		this.vagoes[1] = new Vagao();
		
	}
	public int TotalVagoes() {
		return this.vagoes.length;
	}
	
	
}
