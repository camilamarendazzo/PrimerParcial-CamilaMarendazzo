package unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockTest {

	@Test
	public void queSePuedaDarDeAltaUnIngrediente() {
		Stock stock = new Stock();
		Ingrediente milanesa = new Ingrediente ("milanesa", 50.0);
		stock.darDeAltaUnIngrediente(milanesa);
		assertTrue(stock.consultarExistencia(milanesa.getNombre()));
	}
	
	@Test
	public void queSePuedaConsultarStockDeIngrediente() {
		Stock stock = new Stock();
		Ingrediente milanesa = new Ingrediente ("milanesa", 50.0);
		stock.darDeAltaUnIngrediente(milanesa);
		stock.agregarStock(milanesa.getNombre(), 10);
		assertEquals(stock.stockDeUnIngrediente(milanesa.getNombre()), 10, 0);
	}	
	
	@Test
	public void queSePuedaAgregarStockDeIngrediente() {
		Stock stock = new Stock();
		Ingrediente milanesa = new Ingrediente ("milanesa", 50.0);
		stock.darDeAltaUnIngrediente(milanesa);
		stock.agregarStock(milanesa.getNombre(), 10);
		stock.agregarStock(milanesa.getNombre(), 20);
		assertEquals(stock.stockDeUnIngrediente(milanesa.getNombre()), 30, 0);
	}	
	
	
	@Test
	public void queSePuedaEliminarStockDeIngrediente() {
		Stock stock = new Stock();
		Ingrediente milanesa = new Ingrediente ("milanesa", 50.0);
		stock.darDeAltaUnIngrediente(milanesa);
		stock.agregarStock(milanesa.getNombre(), 10);
		stock.agregarStock(milanesa.getNombre(), 20);
		stock.eliminarStockDeUnIngrediente(milanesa.getNombre());
		assertEquals(stock.stockDeUnIngrediente(milanesa.getNombre()), 0, 0);
	}	
	

}
