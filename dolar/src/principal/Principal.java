package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Valor do d�lar: $ ");
		CurrencyConverter.dolar = sc.nextDouble();
		
		System.out.println("Valor em d�lar: $ ");
		CurrencyConverter.valor = sc.nextDouble();
		

		System.out.printf("Total : %.2f", CurrencyConverter.converter());
	}

}
