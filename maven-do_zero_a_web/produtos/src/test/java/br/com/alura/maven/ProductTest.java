package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductTest {

	@Test
	public void priceWithTaxes() {
		Product p1 = new Product("candy", 0.5);
		assertEquals(0.55, p1.getPrice(), 0.000001);
	}

}
