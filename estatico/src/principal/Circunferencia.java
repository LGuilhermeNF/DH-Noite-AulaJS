package principal;

public class Circunferencia {
	
	public static final double PI = 3.1415;
	
	public static double volume(double raio) {
		return (4 * PI) * Math.pow(raio, 3) / 3;
	}
	
	public static double circunferencia(double raio) {
		return (raio * 2) * PI;
	}

}
