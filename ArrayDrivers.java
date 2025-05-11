import java.util.Scanner;
import java.util.Arrays;

public class ArrayDrivers{
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

	/*System.out.print("How many number you wish to enter: ");
	int size = input.nextInt();
	
	
	int[] LargeNum = new int[size];



	for(int count = 0; count < LargeNum.length; count++) {
	
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		LargeNum[count] = number;
	
	}

	

	System.out.println(ArrayKata.Largest(LargeNum) + " is the largest number");


	System.out.print("How many number you wish to enter: ");
	int value = input.nextInt();
	
	
	int[] smallNum = new int[value];



	for(int count = 0; count < smallNum.length; count++) {
	
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		smallNum[count] = number;
	
	}

	System.out.println(ArrayKata.Smallest(smallNum) +" is the smallest number");

	System.out.print("How many number you wish to enter: ");
	int wish = input.nextInt();
	
	
	int[] sumNum = new int[wish];



	for(int count = 0; count < sumNum.length; count++) {
	
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		sumNum[count] = number;
	
	}
	System.out.print(ArrayKata.Sum(sumNum) +" is the sum of number"); 

	System.out.print("How many number you wish to enter: ");
	int even = input.nextInt();
	
	
	int[] evenNum = new int[even];



	for(int count = 0; count < evenNum.length; count++) {
	
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		evenNum[count] = number;
	
	}
	System.out.println(ArrayKata.SumOfEven(evenNum) +" is the sum of even number");
	
System.out.print("How many number you wish to enter: ");
	int odd = input.nextInt();
	
	
	int[] oddNum = new int[odd];



	for(int count = 0; count < oddNum.length; count++) {
	
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		oddNum[count] = number;
	
	}
	System.out.println(ArrayKata.SumOfOdd(oddNum) +" is the sum of odd number");
	*/
	
System.out.print("How many number you wish to enter: ");
	int value = input.nextInt();
	
	
	int[] smallNum = new int[value];
	int[] largeNum = new int[value];



	for(int count = 0; count < smallNum.length; count++) {
		for(int counter = 0; counter < largeNum.length; counter++) {
	
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		smallNum[count] = number;
		largeNum[counter] = number;
		}
	}

	System.out.println(ArrayKata.LargeSmall(smallNum) +" is the smallest number");
	System.out.println(ArrayKata.LargeSmall(largeNum) + " is the largest number");
}
} 