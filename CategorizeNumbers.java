public class CategorizeNumbers {

	public static String divisibleOfFive(int number) {
	if (number % 5 == 0) {
		return String.valueOf(number); 
	}
	else {
		return "No divisible number found"; }
	}

} 