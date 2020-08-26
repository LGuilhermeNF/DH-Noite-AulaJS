package principal;
import java.util.Scanner;
import geometria.Triangulo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Informe os três lados do primeiro triângulo:");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Informe os três lados do segundo triângulo:");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double xArea = x.calcularArea();
		double yArea = y.calcularArea();
		
		System.out.println("Área do primeiro triângulo: "+ xArea);
		System.out.println("Área do segundo triângulo: "+ yArea);
		
		x.verificarAreaCalculada(xArea, yArea);
		
		sc.close();	
		//3.00 4.00 5.00
		//7.50 4.50 4.02
	}

}
