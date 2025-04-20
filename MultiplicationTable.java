import java.util.Scanner;
	public class MultiplicationTable  {
	public static void main(String[] args) {
Scanner input =  new Scanner(System.in);

	System.out.print("Enter a number for multiplication table: ");
		int number = input.nextInt();

	for(int num =1; num <= 12; num++)
System.out.println(number + " * " + num + " = " + (number * num));



}
}