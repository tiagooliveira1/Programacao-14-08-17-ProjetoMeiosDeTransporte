package opet.aulatds.veiculos;

import java.util.ArrayList;

public class Trem {

	private ArrayList<Vagao> vagoes;
	
	public Trem() {
		this.vagoes = new ArrayList<Vagao>();
		//this.vagoes[1] = new Vagao();
		
	}
	public int TotalVagoes() {
		return this.vagoes.size();
	}
	public void addVagao() {
		Vagao vag = new Vagao();
		vagoes.add(vag);
	}
	
	
}
