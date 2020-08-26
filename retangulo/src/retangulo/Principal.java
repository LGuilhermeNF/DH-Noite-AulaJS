package retangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo r = new Retangulo();
		
		System.out.print("Altura: ");
		r.altura = sc.nextDouble();
		
		System.out.print("Largura: ");
		r.largura = sc.nextDouble();
				
		System.out.println("Area = " + r.area());
		System.out.println("Perimetro = " + r.perimetro());
		System.out.println("Diagnal = " + r.diagonal());
		
		sc.close();
		
	}

}
