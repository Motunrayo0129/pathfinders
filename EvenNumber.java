<<<<<<< HEAD
import java.util.Scanner;
public class EvenNumber {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
System.out.print("Enter the mum1: ");
	int num1 = input.nextInt();

System.out.print("Enter the mum2: ");
	int num2 = input.nextInt();

System.out.print("Enter the mum3: ");
	int num3 = input.nextInt();

System.out.print("Enter the mum4: ");
	int num4 = input.nextInt();

System.out.print("Enter the mum5: ");
	int num5 = input.nextInt();
 
	int largestValue = num1;
	int smallestValue = num1;

 	if (num2 > largestValue) {
		largestValue = num2;

 	if (num3 > largestValue)
		largestValue = num3;

 	if (num4 > largestValue)
		largestValue = num4; 

	if (num5 > largestValue)
		largestValue = num5;

System.out.printf("The largest value is %d%n", largestValue); }

	if (num2 < smallestValue); {
		smallestValue =  num2;

	if (num3 < smallestValue);
		smallestValue =  num3;

	if (num4 < smallestValue);
		smallestValue =  num4;

	if (num5 < smallestValue);
		smallestValue =  num5;

System.out.printf("The smallest value is %d%n", smallestValue); }

	
	int evenNum = 0;
	int countEven = 0;

	if (num1 % 2 == 0){
		evenNum = evenNum + num1;
		countEven = countEven + 1;
	}

	if (num2 % 2 == 0)	{
		evenNum = evenNum + num2;
		countEven = countEven + 1;
	 }

	if (num3 % 2 == 0){	
		evenNum = evenNum + num3;
		countEven = countEven + 1; 
	}

	if (num4 % 2 == 0) {	
		evenNum = evenNum + num4;
		countEven = countEven + 1;  
	}

	if (num5 % 2 == 0) {
		evenNum = evenNum + num5;
		countEven = countEven + 1;
	}


	int averageEven = evenNum / countEven;
System.out.printf("The average of the even num is %d", averageEven); 




=======
public class EvenNumber {
	public static void main(String[] args) {
	int even = 100;
	while(even >= 1) {
	even--;
	if (even % 2 == 0)
System.out.print(" " + even); }
>>>>>>> 63f7f5f ('Motunrayo')


}
}