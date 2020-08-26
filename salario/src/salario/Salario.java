package salario;

public class Salario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - (salarioBruto * (imposto/100)); 
	}
	
	public void aumentarSalario(double taxa) {
		this.salarioBruto = this.salarioBruto + (this.salarioBruto * (taxa/100));
	}
}
