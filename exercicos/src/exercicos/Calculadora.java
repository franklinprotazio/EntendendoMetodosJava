package exercicos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Feito por mim
		
		imprimirTela("Digite um numero ");
		double primeiroNumero = teclado.nextDouble();
		
		imprimirTela("Digite um numero ");
		double segundoNumero = teclado.nextDouble();
		
		imprimirTela(" 1: Soma \n 2: Subtracao \n 3: Multiplicacao \n 4: Divisao");
		int operadorEscolhido = teclado.nextInt();
		
		if(operadorEscolhido == 1) {
			somar(primeiroNumero, segundoNumero);
		}else if (operadorEscolhido == 2) {
			subtrair(primeiroNumero, segundoNumero);
		}else if(operadorEscolhido == 3) {
			multiplicar(primeiroNumero, segundoNumero);
		}else if(operadorEscolhido == 4) {
			divisor(primeiroNumero, segundoNumero);
		}
		
		// Feito pelo Professor
		
		teclado.close();
	}
	
	
	public static void somar(double valor1, double valor2) {
		double resultado = valor1 + valor2;
		imprimirTela("A soma entre os valores eh " + resultado);
	}
	
	public static void subtrair(double valor1, double valor2) {
		double resultado = valor1 - valor2;
		imprimirTela("A subtracao dos valores eh: " + resultado);
	}
	
	public static void multiplicar(double valor1, double valor2) {
		double resultado = valor1 * valor2;
		imprimirTela("A multiplicacao dos valores eh: " + resultado);
	}
	
	public static void divisor(double valor1, double valor2) {
		double resultado = valor1 / valor2;
		imprimirTela("A multiplicacao dos valores eh: " + resultado);
	}
	
	public static void imprimirTela(String texto) {
		System.out.println(texto);
	}

}
