public class ArrayKata {

	public static int Largest(int[] numbers)   {

	int largest = -2_000_000_000;


	for(int counter = 0; counter < numbers.length; counter++){

		if (numbers[counter] > largest) {

			largest = numbers[counter];
		}
	}



	return largest;
	}


	public static int Smallest(int[] numbers)   {

	int smallest = 2_000_000_000;


	for(int counter = 0; counter < numbers.length; counter++){

		if (numbers[counter] < smallest) {

			smallest = numbers[counter];
		}
	}



	return smallest;
	}

	public static int Sum(int[] numbers) { 
    int sum = 0;

    for (int counter = 0; counter < numbers.length; counter++) { 
        sum += numbers[counter]; 
    }

    return sum;
	}
	public static int SumOfEven(int[] numbers) { 
    int sumOfEven = 0;

    for (int counter = 0; counter < numbers.length; counter++) { 
		if(numbers[counter] % 2 == 0) {
        sumOfEven += numbers[counter];
	}	
    }
	return sumOfEven;
	}
	public static int SumOfOdd(int[] numbers) { 
    int sumOfOdd = 0;

    for (int counter = 0; counter < numbers.length; counter++) { 
		if(numbers[counter] % 2 != 0) {
        sumOfOdd += numbers[counter];
	}	
    }
	return sumOfOdd;
	}
	public static int LargeSmall(int[] numbers)   {

	int large = -2_000_000_000;
	int small = 2_000_000_000;

	for(int counter = 0; counter < numbers.length; counter++){

		if (numbers[counter] > large) {

			large = numbers[counter];
			return large;  

			if (numbers[counter] < small) {

			small = numbers[counter];
			}
	}
	return small;
	}




}