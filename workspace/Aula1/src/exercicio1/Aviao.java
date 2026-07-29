package exercicio1;

public class Aviao extends Carro{

	double envergadura;

	void atterizar() {
		System.out.println("Avião passou");
	}
	
	// polimorfismo
	void acelerar() {
			System.out.println("Decolar");
	}
}