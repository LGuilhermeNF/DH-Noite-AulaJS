package principal;

public abstract class Animal {
	private String nome;
	
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public Animal() {
		super();
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void falar(){
		System.out.println("Falando...");
	}
	
	
}
