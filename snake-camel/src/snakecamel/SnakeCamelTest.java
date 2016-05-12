package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
	

	@Test
	public void testSnaketoCamel() {
		String expected = "SodaIceCream";
		String actual = SnakeCamelUtil.snakeToCamelcase("soda_ice_cream");
		assertEquals(expected,actual);
	}
		public void testCameltoSnake(){
			
		String expected = "SodaIceCream";
		String actual = SnakeCamelUtil.snakeToCamelcase("soda_ice_cream");
		assertEquals(actual, expected);
		}
		public void capitalizeTest(){
		
			String expected = "SWEET";
			
			String capSt = SnakeCamelUtil.capitalize("sweet");
			assertEquals(capSt, expected);
			
		}
	
		

				
		/*String expected2 = "melon_cream_soda";
		String actual2 = SnakeCamelUtil.camelToSnakecase("MelonCreamSoda");
		assertEquals(actual2, expected2);*/
			
		
		
		
		
		fail("Not yet implemented");
	}
	}


