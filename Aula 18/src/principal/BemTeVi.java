package principal;

public class BemTeVi extends Passaro{

	public BemTeVi() {
		super();
	}

	public BemTeVi(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		super.falar();
		System.out.println(" e bentivizando");
	}

}
