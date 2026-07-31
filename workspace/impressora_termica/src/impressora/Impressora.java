package impressora;


import java.net.Socket;  //biblioteca usada para estabelecer uma conexão com a rede
import java.io.OutputStream;  //bibioteca usada para enviar e receber dados

//localDateTime(biblioteca para trabalhar com data e hora)
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Impressora {

	public static void main(String[] args) {
		
		
		String desenho =
				"================================\n" +
				"|                              |\n" +
				"|         OLA MATHEUS          |\n" +
				"|                              |\n" +
				"|        \\(^_^)/               |\n" +
				"|          /|\\                 |\n" +
				"|          / \\                 |\n" +
				"|                              |\n" +
				"================================\n\n\n";
			  /*  	"==============================\n" +
			        "         /\\_/\\\\\n" +
			        "        ( o.o )\n" +
			        "        > u <\n" +
			        "  LILY!    MIAU! \n" +
			        "==============================\n\n\n";*/
		
		//tratamento de exceções
		try {
			
			Socket impressora = new Socket("10.26.49.38", 9100);
			OutputStream saida = impressora.getOutputStream();
			
			//a linha abaixo ativa a impressora para receber comandos ESC/POS
			saida.write(new byte[] {0x1B, 0x40});
			
			//imprimir data e hora
			LocalDateTime agora = LocalDateTime.now();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			
			String datahora = "Data: "+ agora.format(formato) + "\n";
			
			//imprimir o conteúdo da varievel
			saida.write(datahora.getBytes("CP850"));
			saida.write("SENAC TATUAPÉ \n\n".getBytes("CP850"));
			//negrito
			saida.write(new byte[] {0x1B,0x45, 0x01});
			saida.write("MATHEUS JADE ESSEYAH \n\n".getBytes("CP850"));
			saida.write(new byte[] {0x1B,0x45, 0x00});
			
			
			//aumentar a fonte
			//saida.write(new byte[] {0x1D, 0x21, 0x11});
			
			//retomar ao tamanho normal
			//saida.write(new byte[]{0x1D,0x21, 0x00});
			
			//centralizar o texto
			saida.write(new byte[] {0x1B, 0x61, 0x01});
			
			//alinhar a esquerda
			//saida.write(new byte[] {0x1B, 0x61, 0x00});
			
			//alinhar a esquerda
			//saida.write(new byte[] {0x1B, 0x61, 0x02});
			
			//negrito
			saida.write(new byte[] {0x1B,0x45, 0x01});
			
			//desativar o negrito
			//saida.write(new byte[] {0x1B,0x45, 0x00});
			
			saida.write(desenho.getBytes("CP850"));
			
			//avançar o papel
			//0x01 (uma linha), 0x05 (5 linhas), 0x06 (6 linhas)
			//atenção, o ultimo byte determina o numero de linhas.
			saida.write(new byte[] {0x1B, 0x64, 0x05});
			
			//corte
			saida.write(new byte[] {0x1D, 0x56, 0x00});
			
			
			//imprimir
			saida.flush();
			
			//encerrar conexção
			impressora.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
