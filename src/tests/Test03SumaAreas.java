package tests;
import modelo.Figura;
import modelo.Rectangulo;
import modelo.Circulo;

public class Test03SumaAreas {
	
	
	
	public static double sumAreas(Figura... figs) {
		int sumAreas = 0;
		for(int i = 0; i < figs.length; i++) {
		sumAreas += figs[i].calculaArea();
			
			
		}
		return sumAreas;
	}
	
	
	public static void main (String[] args) {
		
		Figura f1 = new Rectangulo(1,2,3,4);
		Figura f2 = new Rectangulo(1,2,3,4);
		Figura f3 = new Circulo(1,2,5);
		Figura f4 = new Circulo(5, 6, 20);
		
		Figura[] figss = {f1, f2, f3, f4};
		
		System.out.println(sumAreas(figss));
		

		
		
	}
	
	
	
	
	
	

}
