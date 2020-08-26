package principal;

public class Papagaio extends Passaro{

	public Papagaio() {
		super();
	}

	public Papagaio(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		super.falar();
		System.out.println(" e sei lá");
	}

}
