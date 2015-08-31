package co.edu.uniandes.moviles.mundo;

public class CantidadIngrediente {
	
	private Ingrediente ingrediente;
	private int cantidad;
	
	public CantidadIngrediente(Ingrediente ingrediente, int cantidad){
		this.ingrediente=ingrediente;
		this.cantidad=cantidad;
	}
	
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
