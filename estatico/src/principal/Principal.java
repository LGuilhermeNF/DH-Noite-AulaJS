package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio1, raio2;
		
		System.out.print("Informe o primeiro raio: ");
		raio1 = sc.nextDouble();
		System.out.println();
		
		System.out.print("Informe o segundo raio: ");
		raio2 = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Circunferência: %.2f", Circunferencia.circunferencia(raio1));
		System.out.println();
		
		System.out.printf("Volume: %.2f", Circunferencia.volume(raio1));
		System.out.println();
		
		System.out.printf("Pi: %.2f", Circunferencia.PI);
		System.out.println();
		System.out.println();
		
		System.out.printf("Circunferência: %.2f", Circunferencia.circunferencia(raio2));
		System.out.println();
		
		System.out.printf("Volume: %.2f", Circunferencia.volume(raio2));
		System.out.println();
		
		System.out.printf("Pi: %.2f", Circunferencia.PI);
				
		
	}

}
