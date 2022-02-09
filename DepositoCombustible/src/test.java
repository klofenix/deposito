import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {
//
//	@Test
//	final void testDepositoCombustible() {
//		fail("Not yet implemented");
//	}
	@Test
	final void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.9);
		assertEquals(0.9,tank.getDepositoNivel(),0);
	}

	@Test
	final void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.9);
	assertEquals(40,tank.getDepositoMax(),0);
	}

	@Test
	final void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		assertEquals(true,tank.estaVacio());
	}

	@Test
	final void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(40.0,40.0);
		assertEquals(true,tank.estaLleno());
	}
	
	

	@Test
	final void testFill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,10.0);
		tank.fill(20);
		double add = tank.getDepositoNivel();
		assertEquals(30.0, add, 0);
		
	}

	@Test
	final void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible(40.0, 20.0);
		tank.consumir(10);
		double add = tank.getDepositoNivel();
		assertEquals(10.0, add, 0);
	}

}
