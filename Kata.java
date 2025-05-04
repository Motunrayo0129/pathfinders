public class Kata {
	// public static void main (String[] args)  {}

public static boolean Even(int integer)  {
	if (integer % 2 == 0)  
		return true;
else { return false;  }
}  

	public static boolean palindrome(int number)  {
		int reversedNum = 0;
		int originalNum = number;
			while(number != 0) {
		int remainder = number % 10;
		reversedNum = reversedNum * 10 + remainder;
			number = number / 10; 
				} 
	if (originalNum == reversedNum){
		return true; }
	else {   return false; }

} 
		
	public static int Square(int number) {
		return number * number;

			}

	public static int Substract(int num1, int num2) {
		return num1 - num2;
			}

	public static float Division(int num1, int num2) {
		if (num2 == 0)
		return 0;
	else{ return (float) num1 / num2; }
			}

	public static int Factors(int factor){
		int count = 1;
	for(int i = 1; i <= factor / 2; i++) {
		if (factor % i == 0)
		 ++count;  }
	return count; }

	public static boolean Prime (int prime)  {
	for(int i = 2; i <= prime / 2; i++) {
		if (prime % i == 0) {
		return false;  }
		}
	 return true;  

		 }

}