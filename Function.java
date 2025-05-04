import java.util.Scanner;
public class Function {
	public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter even number: ");
	int integer = input.nextInt();
System.out.println(Kata.Even(integer));

 	input.nextLine();
System.out.print("Enter palidrome number: ");
	int number = input.nextInt();
System.out.println(Kata.palindrome(number));

System.out.print("Enter number to square: ");
	int square = input.nextInt();
System.out.println(Kata.Square(square));

System.out.println("Subtraction");
System.out.print("Enter a number1: ");
	int a = input.nextInt();
System.out.print("Enter a number2: ");
	int b = input.nextInt();
System.out.println(Kata.Substract(a, b));

System.out.println("Division of number");
System.out.print("Enter a number: ");
	int num1  = input.nextInt();
System.out.print("Enter a number: ");
	int num2 = input.nextInt();
System.out.println(Kata.Division(num1, num2));

System.out.println("Enter a number and get how many factor it has");
System.out.print("Enter a number: ");
	int factor = input.nextInt();
System.out.println(Kata.Factors(factor));

System.out.println("Check if is a prime number");
System.out.print("Enter a number: ");
	int prime = input.nextInt();
System.out.println(Kata.Prime(prime));






}
}