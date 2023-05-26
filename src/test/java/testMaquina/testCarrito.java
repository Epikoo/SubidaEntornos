package testMaquina;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.nacho.clases.Carrito;
import com.nacho.clases.Producto;
import com.nacho.clases.Usuario;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class testCarrito {
	Usuario u1;
	Carrito c1;
	@BeforeAll
	void iniciar() {
		u1=new Usuario(1, true, "NAcho", 999999999);
		c1=new Carrito(12313);
		 for (int i = 0; i < 10; i++) {
	            Producto p=new Producto();
	            c1.addProducto(p);
	        }
	}
	@Test
	void testCalcularTotal() {
		assertEquals(129.89999999999998, c1.calcularTotal());
	}
	@Test
	void testCalcularMedia() {
		assertEquals(12.989999999999998, c1.precioMedio());
	}
	@Test
	void testDarsedeBaja() {
		assertEquals(false, u1.darseDeBaja());
	}

}
