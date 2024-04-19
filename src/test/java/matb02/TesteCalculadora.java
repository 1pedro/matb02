package matb02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadora {

	public Calculadora cal = new Calculadora();
	
	@Test
	public void test() {
		double soma = cal.somar(10.0, 1.0);
		assertEquals(11,soma);
		
	}
	
	@Test
	public void testDividir() {
			double dividir = cal.dividir(10.0, 1.0);
			assertEquals(10,dividir);

				
	}
	
	@Test
	public void testDividirnot() {
			double dividir = cal.dividir(10.0, 1.0);

			assertNotEquals(0, dividir);
				
	}
		

}
