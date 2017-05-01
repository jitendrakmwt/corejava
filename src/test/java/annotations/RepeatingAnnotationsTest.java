package annotations;

import java.lang.reflect.Field;

import org.junit.Test;

public class RepeatingAnnotationsTest {

	@Test
	public void testCountries() throws NoSuchFieldException, SecurityException {
		 Products products = new Products();
	        Class<?> c = products.getClass();
	        Field fd = c.getDeclaredField("volleyBall");
	        Country[] countries = fd.getAnnotationsByType(Country.class);
	        for (Country country : countries) {
	            System.out.println(country.name());
	            System.out.println(country.noOfMatches());

	        }
	}
}
