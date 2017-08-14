package opet.aulatds.main;

import opet.aulatds.veiculos.Carro;
import opet.aulatds.veiculos.Trem;

public class MainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		carro.setCor("vermelho");
		
		Carro Segundo_carro = new Carro("vermelho", 2017);
		Trem trem = new Trem();
		
		System.out.println( trem.TotalVagoes() );

		
	}

}
