package geometria;

public class Triangulo {
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double calcularArea(){
		double p = (ladoA + ladoB + ladoC)/2.0;
		double area = Math.sqrt( p*(p-ladoA)*(p-ladoB)*(p-ladoC) );
		return area;
	}
	
	public void verificarAreaCalculada(double xArea, double yArea) {
		if (xArea > yArea) {
			System.out.println("Primeiro tri�ngulo � o maior!");
		} else {
			System.out.println("Segundo tri�ngulo � o maior!");
		}
	}
}
