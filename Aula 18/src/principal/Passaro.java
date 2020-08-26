package principal;

public class Passaro extends Animal{

	public Passaro() {
		super();
	}
	
	public Passaro(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		super.falar();
		System.out.println(" e piando...");
	}
}
