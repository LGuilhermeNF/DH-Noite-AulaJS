package salario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Salario s = new Salario();
		System.out.println("!!!! Salário !!!!");
		System.out.print("Funcionário: ");
		s.nome = sc.next();
		
		System.out.print("Salário: R$ ");
		s.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: % ");
		s.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + s.nome + ", Salário Líquido: R$ " + s.salarioLiquido());
		System.out.println();
		
		System.out.print("Informe o percentual para aumento do salário: ");
		s.aumentarSalario(sc.nextDouble());
		System.out.println();
		System.out.println("Funcionário: " + s.nome + ", Novo Salário Líquido: R$ " + s.salarioBruto);
		

	}

}
