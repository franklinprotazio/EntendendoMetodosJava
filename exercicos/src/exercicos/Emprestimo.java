package exercicos;

import java.util.Scanner;

public class Emprestimo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Valor do emprestimo: ");	
		double valorEmprestimo = teclado.nextDouble();
		
		System.out.print("Quantidade das parcelas: ");
		int quantidadeParcelas = teclado.nextInt();
		
		taxar(valorEmprestimo, quantidadeParcelas);
		
		teclado.close();
				
	}
	
	public static void taxar(double emprestimo, int valor) {
		if(valor <= 3) {
			double valorPagamento = ((emprestimo * 10 / 100) + emprestimo);
			imprimirTela(" O emprestimo eh de "+  emprestimo + "\n Parcelado em " + valor + "\n valor a ser pago: " + valorPagamento);
		}else if(valor > 3 && valor <= 5) {
			double valorPagamento = ((emprestimo * 20 / 100) + emprestimo);
			imprimirTela(" O emprestimo eh de "+  emprestimo + "\n Parcelado em " + valor + "\n valor a ser pago: " + valorPagamento);
		}
	}
	
	public static void imprimirTela(String texto) {
		System.out.println(texto);
	}

}
