package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluno a = new Aluno();
		
		
		System.out.print("Informe o nome do aluno: ");
		a.nome = sc.nextLine();
		
		System.out.print("Informe o nota do aluno: ");
		a.nota1 = sc.nextDouble();
		
		System.out.print("Informe o nota do aluno: ");
		a.nota2 = sc.nextDouble();
		
		System.out.print("Informe o nota do aluno: ");
		a.nota3 = sc.nextDouble();
		System.out.println();
		
		a.media();
		a.mensagem();
		
		
		sc.close();
	}

}
