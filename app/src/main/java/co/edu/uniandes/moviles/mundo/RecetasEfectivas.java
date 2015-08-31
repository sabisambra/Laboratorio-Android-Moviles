package co.edu.uniandes.moviles.mundo;

import java.util.ArrayList;

public class RecetasEfectivas {
	
	private ArrayList<Ingrediente> ingredientes;
	private ArrayList<Receta> recetas;
	
	private static RecetasEfectivas instancia;
	
	public static RecetasEfectivas darInstancia(){
		if(instancia == null)
		{
			instancia = new RecetasEfectivas();
		}
		return instancia;
	}
	
	public RecetasEfectivas(){
		ingredientes= new ArrayList<Ingrediente>();
		recetas= new ArrayList<Receta>();
	}
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public ArrayList<Receta> getRecetas() {
		return recetas;
	}
	public void setRecetas(ArrayList<Receta> recetas) {
		this.recetas = recetas;
	}
	
	public void agregarIngrediente(Ingrediente i){
		ingredientes.add(i);
	}
	
	public void agregarReceta(Receta r){
		recetas.add(r);
	}
	
	public Receta darReceta(String nombre){
		for (int i = 0; i < recetas.size(); i++) {
			Receta r = recetas.get(i);
			if(r.getNombre().equals(nombre)){
				return r;
			}
		}
		return null;
	}
	
	public Ingrediente darIngrediente(String nombre){
		for (int i = 0; i < ingredientes.size(); i++) {
			Ingrediente ingrediente = ingredientes.get(i);
			if(ingrediente.getNombre().equals(nombre)){
				return ingrediente;
			}
		}
		return null;
	}
	
	public String[] darListaIngredientes(){
		String[] lista= new String[ingredientes.size()];
		for(int i=0; i<ingredientes.size(); i++){
			lista[i]= ingredientes.get(i).getNombre();
		}
		return lista;
	}
	
	public String[] darListaRecetas(){
		String[] lista= new String[recetas.size()];
		for(int i=0; i<recetas.size(); i++){
			lista[i]= recetas.get(i).getNombre();
		}
		return lista;
	}
	
	
}
