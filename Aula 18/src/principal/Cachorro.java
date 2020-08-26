package principal;

public class Cachorro extends Mamifero{

	
	public Cachorro() {
		super();
	}

	public Cachorro(String nome) {
		super(nome);
	}
	
	@Override
	public void falar() {
		super.falar();
		System.out.println(" e Latindo");
	}

}
