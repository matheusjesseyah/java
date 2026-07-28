package poo;

public class Itens {

	public static void main(String[] args) {
		// instanciando(criar) um objeto de nome enxada
		Enxada enxada = new Enxada();
		enxada.conquista = false;
		System.out.println("Item: Enxada");
		enxada.arar();
		if (enxada.conquista == true) {
			System.out.println("--------------------------");
			System.out.println("Conquista obtida!");
			System.out.println("Dedicação séria: Hora de plantio");
			System.out.println("--------------------------");
		}
		enxada.minerar();
	}

}
