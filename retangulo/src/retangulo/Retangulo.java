package retangulo;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double area(){
		return this.altura * this.largura;
	}

	public double perimetro() {
		return (altura * 2) + (largura * 2);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.largura, 2)+Math.pow(this.altura, 2));
	}
	
	
}
