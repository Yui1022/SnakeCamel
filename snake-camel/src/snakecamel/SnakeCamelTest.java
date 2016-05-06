package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void test() {
		SnakeCamelUtil snacam = new SnakeCamelUtil();
		String expected = "SodaIceCream";
		String actual = snacam.snakeToCamelcase("soda_ice_cream");
		assertEquals(actual, expected);
		
		SnakeCamelUtil snacam2 = new SnakeCamelUtil();
		String expected2 = "melon_cream_soda";
		String actual2 = snacam.snakeToCamelcase("MelonCreamSoda");
		assertEquals(actual2, expected2);
			
		
		
		
		
		fail("Not yet implemented");
	}

}
