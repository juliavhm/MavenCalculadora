package calcula;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadora {

	@Test
	public void tresMultTresEsperaNove() {
		Calculadora c = new Calculadora();
		assertEquals(9, c.multiplicaInteiros(3, 3));
	}

	@Test
	public void doisMultCincoEsperaDez() {
		Calculadora c = new Calculadora();
		assertEquals(10, c.multiplicaInteiros(2, 5));
	}

	@Test
	public void cincoMultCincoEsperaVinteECinco() {
		Calculadora c = new Calculadora();
		assertEquals(25, c.multiplicaInteiros(5, 5));

	}

	@Test
	public void tresDivideTresEsperaUm() {
		Calculadora c = new Calculadora();
		assertTrue(c.divideInteiros(3, 3) == 1);
	}

	@Test
	public void quatroDivideDoisEsperaDois() {
		Calculadora c = new Calculadora();
		assertTrue(c.divideInteiros(4, 2) == 2);
	}

	@Test
	public void dezDivideDoisEsperaCinco() {
		Calculadora c = new Calculadora();
		assertTrue(c.divideInteiros(10, 2) == 5);

	}

	@Test
	public void tresSubTresEsperaZero() {
		Calculadora c = new Calculadora();
		assertEquals(0, c.subtraInteiros(3, 3));
	}

	@Test
	public void OitoSubTresEsperaCinco() {
		Calculadora c = new Calculadora();
		assertEquals(5, c.subtraInteiros(8, 3));
	}

	@Test
	public void CincoSubTresEsperaDois() {
		Calculadora c = new Calculadora();
		assertEquals(2, c.subtraInteiros(5, 3));
	}

	@Test
	public void doisSomaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.SomaInteiros(2, 2));
	}

	@Test
	public void tresSomaSeteEsperaDez() {
		Calculadora c = new Calculadora();
		assertTrue(c.SomaInteiros(3, 7) == 10);

	}

	@Test
	public void QuatroSomaDoisEsperaSeis() {
		Calculadora c = new Calculadora();
		assertTrue(c.SomaInteiros(4, 2) == 6);

	}
}
