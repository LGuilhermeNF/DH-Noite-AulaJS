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
			System.out.println("M�dia: " + media() + " Parab�ns! Voc� Passou!");
		} else {
			System.out.println("M�dia: " + media() + " Que pena! N�o foi dessa vez. Por favor tente novamente1...");
		}
	}
	
}
