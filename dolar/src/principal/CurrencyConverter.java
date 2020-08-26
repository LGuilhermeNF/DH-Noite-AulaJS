package principal;

public class CurrencyConverter {

	public static final double TX = 0.06;
	public static double dolar;
	public static double valor;
	
	public static double converter() {
		return (valor + (valor * TX)) * dolar;
	}
	
}
