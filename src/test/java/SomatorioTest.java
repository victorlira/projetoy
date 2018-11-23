package test.java;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.Somatorio;

public class SomatorioTest {

	@Test
	public void TestSimples() {
		assertEquals(10, Somatorio.somar(7,  3));
		assertEquals(45, Somatorio.somar(40,  5));
		assertEquals(2, Somatorio.somar(0,  0));
	}

}
