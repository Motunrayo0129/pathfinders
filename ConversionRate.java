


import java.util.Scanner;
public class ConversionRate {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
System.out.print("Enter the exchange rate from dollars to RMB: ");
	double currencyRate = input.nextDouble();
System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");	
	double rmbAmount = input.nextDouble(); 


	System.out.print("Enter the dollar amount: "); 
	if (rmbAmount == 1) {
	System.out.printf("is %.2f%n ", dollarCurrency);   }
		double rmbCurrency = currencyRate / dollarAmount;

	if (rmbAmount == 0) {
		double dollarAmount = input.nextDouble();
		double dollarCurrency = dollarAmount * currencyRate;
System.out.print("invalid input"); }






}
}