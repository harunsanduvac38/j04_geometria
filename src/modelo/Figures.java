package modelo;

public abstract class  Figures {
	
	private double x;
	private double y;
	
	public Figures(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public Figures() {}
	
	
	public double getX() {
		return x;
	}
	public void setX (double x) {
		this.x = x;
	}
	
	

	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y=y;	
	}
	
	
	public abstract double calculaArea();
	
	
	public abstract  double calculaPerimetro();
	
	
	public static Punto centroMasas(Figures... figs) {
		double centroMasaX1= 0;
		double centroMasaArea = 0;
		double centroMasaX = 0;
		double centroMasaY= 0;
		double centroMasaY1= 0;
		
		for(int i = 0; i < figs.length; i++) {
			centroMasaX1 += figs[i].calculaArea() * figs[i].getX();
			centroMasaY1 += figs[i].calculaArea()*figs[i].getY();
			centroMasaArea += figs[i].calculaArea();
		}
		centroMasaX = centroMasaX1 / centroMasaArea;
		
		centroMasaY = centroMasaY1 /centroMasaArea;
		
		
		return new Punto(centroMasaX, centroMasaY);
		
	}
	
	

	
	public boolean equals(Object otro) {
		if(otro==null) return false;
		if(this==otro) return true;
		if(this.getClass() != otro.getClass()) return false;
		Figures otra = (Figures) otro;
		return this.x == otra.x &&this.y ==y;
	}
	
	
	@Override
	public String toString() {
		return "Figures [x=" + x + ", y=" + y + "]";
	}

	
	
	

}
