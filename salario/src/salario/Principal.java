package salario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Salario s = new Salario();
		System.out.println("!!!! Sal�rio !!!!");
		System.out.print("Funcion�rio: ");
		s.nome = sc.next();
		
		System.out.print("Sal�rio: R$ ");
		s.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: % ");
		s.imposto = sc.nextDouble();
		
		System.out.println("Funcion�rio: " + s.nome + ", Sal�rio L�quido: R$ " + s.salarioLiquido());
		System.out.println();
		
		System.out.print("Informe o percentual para aumento do sal�rio: ");
		s.aumentarSalario(sc.nextDouble());
		System.out.println();
		System.out.println("Funcion�rio: " + s.nome + ", Novo Sal�rio L�quido: R$ " + s.salarioBruto);
		

	}

}
