package poo;

public class Enxada extends Bloco {
	// atributios
	boolean conquista;

	// método
	void arar() {
		System.out.println("Terra preparada para plantio");
		conquista = true;
	}

	// polimorfismo
	// ATENÇAO!! mesmo nome do método a ser modificado

	void minerar() {
		System.out.println("Dano atribuído");
	}

}
