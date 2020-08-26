package principal;

public class Mamifero extends Animal{
	
	public Mamifero() {
		super();
	}

	public Mamifero(String nome) {
		super(nome);
	}
	
	@Override
	public void falar() {
		super.falar();
		System.out.println(" e mamando");
	}

}
