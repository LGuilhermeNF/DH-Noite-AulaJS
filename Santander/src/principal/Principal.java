package principal;

import java.util.Scanner;

import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		
		Integer op;
		
		Scanner sc = new Scanner(System.in);
		ContaPoupanca cp = new ContaPoupanca();
		ContaCorrente cc = new ContaCorrente();
		
		System.out.print("1. Conta Poupança \n 2.Conta Corrente");
		op = sc.nextInt();
		
		
		sc.close();
		
	}
	
	public void menu(Integer op) {
		switch (op) {
		case 1: 
			System.out.println("Conta poupança");
			break;
		case 2: 
			System.out.println("Conta corrente");
			break;
		
		}
	}

}
