package exercicos;

import java.util.Scanner;

public class HoraDia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite as horas");
		int hora = teclado.nextInt();
		
		mensagem(hora);
		
		teclado.close();

	}
	
	
	public static void mensagem(int valor) {
		if(valor >= 5 && valor <= 12) {
			imprimirTela("Bom dia");
		}else if(valor >= 13 && valor <= 17) {
			imprimirTela("Boa tarde");
		}else if( valor >= 18 && valor < 23 ) {
			imprimirTela("Boa noite");
		}else if(valor >= 0 && valor <= 4) {
			imprimirTela("Boa noite");
		}
	}
	
	public static void imprimirTela(String texto) {
		System.out.println(texto);
	}

}
