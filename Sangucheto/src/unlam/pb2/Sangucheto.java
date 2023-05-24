package unlam.pb2;

import java.util.ArrayList;
import java.util.Iterator;

public class Sangucheto {
	
	private ArrayList<Ingrediente> ingredientes;

	public Sangucheto() {
		ingredientes = new ArrayList<>();
	}
	
	public void agregarIngrediente (Ingrediente nuevo) {
		if (nuevo.getCantidad()>0) {
			ingredientes.add(nuevo);
			nuevo.setCantidad(nuevo.getCantidad()-1);
		}
	}
	
	public Double consultarPrecio() {
		Double precio = 0.0;
		for (Ingrediente ingrediente: ingredientes) {
			precio += ingrediente.getPrecio();
		}
		return precio;
	}
	
	public ArrayList<Ingrediente> consultarIngredientes() {
		ArrayList<Ingrediente> resultado = new ArrayList<>();
		for (Ingrediente ingrediente : ingredientes) {
			if(ingrediente instanceof Ingrediente) {
				resultado.add(ingrediente);
			}
		} 
		return resultado;
	}
	
	public ArrayList<Agregado> consultarAgregados() {
		ArrayList<Agregado> resultado = new ArrayList<>();
		for (Ingrediente agregado : ingredientes) {
			if(agregado instanceof Agregado) {
				resultado.add((Agregado)agregado);
			}
		} 
		return resultado;
	}
	
	public void cancelar () {
		ingredientes.clear();
	}
	
	public boolean existeIngrediente(Ingrediente ingrediente) {
		if (ingredientes.contains(ingrediente)) {
			return true;
		} else return false;
	}
	
	public Integer cantidadDeIngredientes() {
		return ingredientes.size();
	}

}
