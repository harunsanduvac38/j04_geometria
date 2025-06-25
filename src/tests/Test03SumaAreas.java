package tests;
import modelo.Figures;
import modelo.Rectangulo;
import modelo.Circulo;

public class Test03SumaAreas {
	
	
	
	public static double sumAreas(Figures... figs) {
		int sumAreas = 0;
		for(int i = 0; i < figs.length; i++) {
		sumAreas += figs[i].calculaArea();
			
			
		}
		return sumAreas;
	}
	
	
	public static void main (String[] args) {
		
		Figures f1 = new Rectangulo(1,2,3,4);
		Figures f2 = new Rectangulo(1,2,3,4);
		Figures f3 = new Circulo(1,2,5);
		Figures f4 = new Circulo(5, 6, 20);
		
		Figures[] figss = {f1, f2, f3, f4};
		
		System.out.println(sumAreas(figss));
		

		
		
	}
	
	
	
	
	
	

}
