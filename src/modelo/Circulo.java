package modelo;

public class Circulo extends Figura implements Dibujable{
	
	private double radio;
	
	
	public Circulo(double x, double y, double radio) {
		super(x,y);
		this.radio = radio;
		
	}
	
	
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}

	
	public double getDiametro() {
		return 2 * radio;
	}
	
	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	
	@Override
	public double calculaPerimetro() {
		return Math.PI * getDiametro();
	}
	
	
	@Override
	public boolean equals (Object otro) {
		if(!super.equals(otro)) return false;
		Circulo cir = (Circulo) otro;
		return this.radio == cir.radio;
	}
	
	@Override
	public String toString() {
		return "Circulo [radio= " + radio + ", getDiametro= " + getDiametro() + "]";
	}



	@Override
	public void dibujar() {
		System.out.println("Dibujando el circulo");
	}

}
