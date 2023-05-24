package unlam.pb2;

import java.util.Objects;

public class Ingrediente {
	
	private String nombre;
	private Integer cantidad;
	private Double precio;

	public Ingrediente(String nombre, Double precio) {
		this.nombre = nombre;
		this.cantidad = 0;
		this.precio = precio;
	}
	
	public Integer consultarStock() {
		return this.cantidad;
	}	

	public String getNombre() {
		return nombre;
	}
	
	public void setCantidad(Integer stock) {
		this.cantidad = stock;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingrediente other = (Ingrediente) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	

}
