package tests;
import modelo.Figures;
import modelo.Circulo;
import modelo.Rectangulo;

public class Test01 {

	
	public static void main(String[] args) {
		
		Figures f = new Figures();
		
		System.out.println(f);
		
		Rectangulo r = new Rectangulo (1.5, 4, 10,6);
		System.out.println("Area: " + r.calculaArea());
		System.out.println("Perimetro: " + r.calculaPerimetro());
		
		System.out.println(r + "\n");
	
		Circulo cir = new Circulo(4,5,7);
		
		System.out.println(cir);
		System.out.println("Area circulo: " + cir.calculaArea());
		System.out.println("Perimertro Circulo: " + cir.calculaPerimetro());
		
		Circulo cir2 = new Circulo(1,2,10);
		System.out.println("Circulo2 :" + cir2);
		System.out.println("Area circulo2: " + cir2.calculaArea());
		System.out.println("Perimertro Circulo2: " + cir2.calculaPerimetro());
		
		System.out.println(cir.equals(cir2));
		
		
		Figures f2 = cir;
		
		System.out.println("class f2: " + f2.getClass());
	}
	
}
