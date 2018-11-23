package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Somatorio;

class SomatorioTest {

	@Test
	void TestSimples() {
		assertEquals(10, Somatorio.somar(7,  3));
		assertEquals(45, Somatorio.somar(40,  5));
		assertEquals(1, Somatorio.somar(0,  0));
	}

}
