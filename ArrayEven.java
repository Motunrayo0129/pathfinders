public class ArrayEven {

	public static int[] SumOfEven(int[] numbers) { 
    int sumOfEven = 0;

    for (int counter = 0; counter < numbers.length; counter++) { 
		if(numbers[counter] % 2 == 0) {
        sumOfEven += numbers[counter];
	}	
    }
	return sumOfEven;
	}

	
	public static int[] MinMax(int[] numbers)   {

	int[] largest = -2_000_000_000;
	int[] smallest = 2_000_000_000;

	for(int counter = 0; counter < numbers.length; counter++){
		if (numbers[counter] > largest) {
			largest = numbers[counter];
		}
			return largest;
	}

	for(int counter = 0; counter < numbers.length; counter++){

		if (numbers[counter] < smallest) {

			smallest = numbers[counter];
		}
			return smallest;
	}


	}  
	public static int Multiply(int number1, int number2) {
			int sum = 0;
		for(int num = 1; num <= number2 ;num ++){
				sum += number1;
		}
			return sum;


	}

}