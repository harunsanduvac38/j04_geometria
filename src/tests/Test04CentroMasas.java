package tests;
import modelo.Rectangulo;
import modelo.Circulo;
import modelo.Figures;
import modelo.Punto;

public class Test04CentroMasas {
	public static void main (String[] args) {
		
		Rectangulo r1 = new Rectangulo(1,2,4,6);
		Rectangulo r2 = new Rectangulo(24,5,6,7);
		Circulo c1 = new Circulo(3,6,7);
		Circulo c2 = new Circulo(-34,-6, 5);
		
		Punto centroMasa = Figures.centroMasas(r1,r2,c1,c2);
		System.out.println(centroMasa);
		
		Punto centro = Figures.centroMasas(r1,r2);
		System.out.println("Centro masa: " + centro);
		
	}
}
