package poo;

public class Mundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Objeto1
		Bloco blocoTerra = new Bloco();
		blocoTerra.resistencia = 1;
		blocoTerra.textura = "Terra";
		System.out.println("Bloco: "+ blocoTerra.textura);
		System.out.println("Resistência: "+ blocoTerra.resistencia);
		blocoTerra.minerar();
		blocoTerra.construir();
		
		//Objeto2
		Bloco blocoMadeira = new Bloco();
		blocoMadeira.resistencia = 2;
		blocoMadeira.textura = "Madeira";
		System.out.println("Bloco: "+ blocoMadeira.textura);
		System.out.println("Resistência: "+ blocoMadeira.resistencia);
		blocoMadeira.minerar();
		blocoMadeira.craftar();
	}

}
