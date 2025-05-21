import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

	public class CategorizeNumbersTest {

	@Test
	public void testIfNumberIsDivisibleByFive() {
		String expected = "15";
		String returned = CategorizeNumbers.divisibleOfFive(15);
		assertEquals(expected, returned);

		/*expected = "No divisible number found";
		returned = CategorizeNumbers.divisibleOfFive(17);
		assertEquals(expected, returned);*/



}

}