package modelo.otro;

import modelo.Dibujable;
import modelo.Figura;

public class Cliente implements Dibujable {
	
	private int id;
	private String nombre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
//	@Override
//	public boolean equals(Object otro) {
//		if(otro==null) return false;
//		if(this==otro) return true;
//		if(this.getClass() != otro.getClass()) return false;
//		Figures otra = (Figures) otro;
//		return this.x == otra.x && this.y == y;
		
//	}
	@Override
	public void dibujar() {
		System.out.println("Dibujando el cliente");
	}

}

//if(otro==null) return false;
//if(this==otro) return true;
//if(this.getClass() != otro.getClass()) return false;
//Figures otra = (Figures) otro;
//return this.x == otra.x &&this.y ==y;