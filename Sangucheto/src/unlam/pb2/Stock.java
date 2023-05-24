package unlam.pb2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Stock {
	
	private Set<Ingrediente> ingredientes;
	private final static Integer NO_EXISTE = -1;

	public Stock() {
		ingredientes = new HashSet<Ingrediente>();
		generarStock();
	}

	private void generarStock() {
		Ingrediente pan = new Ingrediente("pan", 30.0);
		Ingrediente lechuga = new Ingrediente("lechuga", 50.0);
		Ingrediente tomate = new Ingrediente("tomate", 50.0);
		Ingrediente mostaza = new Agregado ("mostaza", 10.0);
	}
	
	public HashSet<Ingrediente> listarIngredientesDisponibles(){
		HashSet <Ingrediente> resultado = new HashSet<>();
		Iterator<Ingrediente> iterator = ingredientes.iterator();
		while (iterator.hasNext()){
			Ingrediente ingrediente = iterator.next();
			if(ingrediente.getCantidad()>0) {
				resultado.add(ingrediente);
			}
		}
		return resultado;
	}
	
	public HashSet<Ingrediente> listarTodosLosIngredientes(){
		return (HashSet<Ingrediente>)ingredientes;
	
	}
	
	public void darDeAltaUnIngrediente(Ingrediente nuevo) {
		ingredientes.add(nuevo);
	}
	
	public void agregarStock(String nombre, Integer cantidad) {
		Iterator<Ingrediente> iterator = ingredientes.iterator();
		while (iterator.hasNext()){
			Ingrediente ingrediente = iterator.next();
			if(nombre.equals(ingrediente.getNombre())) {
				ingrediente.setCantidad(ingrediente.getCantidad() + cantidad);
			}
		}
	}
	
	public Integer stockDeUnIngrediente(String nombre) {
		Integer stock = NO_EXISTE;
		Iterator<Ingrediente> iterator = ingredientes.iterator();
		while (iterator.hasNext()){
			Ingrediente ingrediente = iterator.next();
			if ( nombre.equals(ingrediente.getNombre())) {
				stock = ingrediente.getCantidad();
			}
		}
		return stock;
	}

	public boolean consultarExistencia(String nombre) {
		
		for (Ingrediente ingrediente : ingredientes) {
			if(ingrediente.getNombre().equals(nombre)) {
				return true;
			}
		} 
		return false;
	}
	
	public void comprarIngrediente (String nombre, Integer cantidad) {
		Iterator<Ingrediente> iterator = ingredientes.iterator();
		while (iterator.hasNext()){
			Ingrediente ingrediente = iterator.next();
			if (nombre.equals(ingrediente.getNombre())) {
				ingrediente.setCantidad(ingrediente.getCantidad() - cantidad);
			}
		}
	}
	
	public void eliminarStockDeUnIngrediente (String nombre) {
		Iterator<Ingrediente> iterator = ingredientes.iterator();
		while (iterator.hasNext()){
			Ingrediente ingrediente = iterator.next();
			if (nombre.equals(ingrediente.getNombre())) {
				ingrediente.setCantidad(0);
			}
		}
	}
	
	public void eliminarIngrediente (String nombre) {
		Iterator<Ingrediente> iterator = ingredientes.iterator();
		while (iterator.hasNext()){
			Ingrediente ingrediente = iterator.next();
			if (nombre.equals(ingrediente.getNombre())) {
				iterator.remove();
			}
		}
	}
	
	private Ingrediente buscarIngrediente(String nombre){
		Iterator<Ingrediente> iterator = ingredientes.iterator();
		while (iterator.hasNext()){
			Ingrediente ingrediente = iterator.next();
			if (nombre.equals(ingrediente.getNombre())) {
				return ingrediente;
			}
		}
		return null;
	}
	
}
