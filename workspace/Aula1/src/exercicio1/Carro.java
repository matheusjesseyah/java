package exercicio1;

import java.util.Random;

public class Carro {

	int ano;
	String cor;
	
	
	
	public Carro() {
		System.out.println("=====================");
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(100); // Gera números de 0 a 99
            System.out.print(numero);
        }
		System.out.println(" *");
	}

	void ligar() {
		System.out.println("LIGAR");
	}

	void desligar() {
		System.out.println("DESLIGAR");
	}

	void acelerar() {
		System.out.println("ACELERAR");
	}

}
