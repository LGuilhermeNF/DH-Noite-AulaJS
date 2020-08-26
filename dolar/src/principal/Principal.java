package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Valor do dólar: $ ");
		CurrencyConverter.dolar = sc.nextDouble();
		
		System.out.println("Valor em dólar: $ ");
		CurrencyConverter.valor = sc.nextDouble();
		

		System.out.printf("Total : %.2f", CurrencyConverter.converter());
	}

}
