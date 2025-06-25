package modelo;
import modelo.Figures;
import modelo.Circulo;
import modelo.Rectangulo;


public class Punto extends Figures{
	
	public Punto(double x, double y) {
		super(x,y);
	}
	

	
	public static Punto centroMasas(Figures... figs) {
		double centroMasaX1= 0;
		double centroMasaX2 = 0;
		double centroMasaX = 0;
		for(int i = 0; i < figs.length; i++) {
			centroMasaX1 += figs[i].calculaArea() * figs[i].getX();
			centroMasaX2 += figs[i].calculaArea();
		}
		centroMasaX = centroMasaX1 / centroMasaX2;
		
		
		double centroMasaY= 0;
		double centroMasaY1= 0;
		double centroMasaY2= 0;
		for(int i = 0; i<figs.length;i++) {
			centroMasaY1 += figs[i].calculaArea()*figs[i].getY();
			centroMasaY2 += figs[i].calculaArea();
			
		}
		centroMasaY = centroMasaY1 /centroMasaY2;
		
		
		
		return new Punto(centroMasaX, centroMasaY);
		
	
	}
	
	
	public static void main(String[] args) {
		
		Figures f1 = new Rectangulo(1,2,3,4);
		Figures f2 = new Rectangulo(1,2,3,4);
		Figures f3 = new Circulo(1,2,5);
		Figures f4 = new Circulo(5, 6, 20);
		
		Figures[] figss = {f1, f2};
		
		System.out.println(centroMasas(figss));
	}
	
	
	
	
	
	

}
