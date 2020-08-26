package principal;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media() {
		return nota1 + nota2 + nota3;
	}
	
	public void mensagem() {
		if (media() >= 60) {
			System.out.println("Média: " + media() + " Parabéns! Você Passou!");
		} else {
			System.out.println("Média: " + media() + " Que pena! Não foi dessa vez. Por favor tente novamente1...");
		}
	}
	
}
