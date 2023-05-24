package unlam.pb2;
import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class SanguchetoTest {

	@Test
	public void queSePuedaAgregarUnIngrediente() {
		Sangucheto sanguche = new Sangucheto();
		Ingrediente i1 = new Ingrediente ("milanesa", 50.0);
		i1.setCantidad(1);
		sanguche.agregarIngrediente(i1);
		assertTrue(sanguche.existeIngrediente(i1));
	}
	
	
	@Test
	public void queSePuedaConsultarElPrecioEnCualquierMomento() {
		Sangucheto sanguche = new Sangucheto();
		Ingrediente i1 = new Ingrediente ("milanesa", 50.0);
		i1.setCantidad(1);
		Ingrediente i2 = new Ingrediente ("queso", 40.0);
		i2.setCantidad(1);
		sanguche.agregarIngrediente(i1);
		sanguche.agregarIngrediente(i2);
		assertEquals(90.0, sanguche.consultarPrecio(), 0.0);
	}

	
	@Test
	public void queSePuedaCancelar() {
		Sangucheto sanguche = new Sangucheto();
		Ingrediente i1 = new Ingrediente ("milanesa", 50.0);
		i1.setCantidad(1);
		Ingrediente i2 = new Ingrediente ("queso", 40.0);
		i2.setCantidad(1);
		Agregado a1 = new Agregado ("mostaza", 15.0);
		sanguche.agregarIngrediente(i1);
		sanguche.agregarIngrediente(i2);
		sanguche.agregarIngrediente(a1);
		sanguche.cancelar();
		assertTrue(sanguche.cantidadDeIngredientes()==0);

	}	
	

}
