package principal;

public class Vaca extends Mamifero{

	public Vaca() {
		super();
	}

	public Vaca(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		super.falar();
		System.out.println(" e Mugindo");
	}
	
}
