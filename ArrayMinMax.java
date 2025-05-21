import java.util.Arrays;
public  class ArrayMinMax  {
	public static void main (String[] args) {
		
		int firstSum = 0;
		int secondSum = 0;
		int thirdSum = 0;
		int forthSum = 0;
		int fifthSum = 0;
		int sixthSum = 0;
	int[] numbers = new int[6]; //[8, 0, 1, 4, 9, 2]
		numbers[0] = 8;
		numbers[1] = 0;
		numbers[2] = 1;
		numbers[3] = 4;
		numbers[4] = 9;
		numbers[5] = 2;

		
			int sum = 0;	
	for(int num = 0; num < numbers.length; num++) {
		 sum += numbers[num];
		}
		 firstSum = sum - numbers[0];	
		secondSum = sum - numbers[1];
		thirdSum = sum - numbers[2];
		 forthSum = sum - numbers[3];	
		fifthSum = sum - numbers[4];
		sixthSum = sum - numbers[5];

			int max = firstSum;
			int min = firstSum;

	if(sixthSum > max)  
		max = sixthSum;
	if(secondSum > max)  
		max = secondSum;
	if(thirdSum  > max)  
		max = thirdSum ;
	if(forthSum > max)  
		max = forthSum;
	if(fifthSum > max)  
		max = fifthSum;
System.out.printf("The largest number is %d%n", max);

	if(sixthSum < min)  
		min = sixthSum;
	if(secondSum < min)  
		min = secondSum;
	if(thirdSum  < min)  
		min = thirdSum ;
	if(forthSum < min)  
		min = forthSum;
	if(fifthSum < min)  
		min = fifthSum;
System.out.printf("The smallest number is %d%n ", min);


	






}
}
