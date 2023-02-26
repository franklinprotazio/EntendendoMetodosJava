package exercicos;

public class QuadrilateroReturn {
	
	public static double area(double lado) {
		double resultado = lado * lado;
		return resultado;
	}
	
	public static double area(double lado1, double lado2) {
		double resultado = lado1 * lado2;
		return resultado;
	}
	
	public static double area(double baseMaior, double baseMenor, double altura) {
		double resultado = (baseMaior + baseMaior) * altura / 2;
		return resultado;
	}
	
}
