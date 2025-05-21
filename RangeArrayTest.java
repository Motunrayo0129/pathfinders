import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
	public class RangeArrayTest {

		@Test
	public void arrayReturnRange() { 
		int[] array = {5, 6, 10, 15, 20};
		int[] expected = {15};
		int[] check = KataRangeArray.ranges(array);
		assertArrayEquals(expected, check);


	}

   





} 