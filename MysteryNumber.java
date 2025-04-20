import java.util.Scanner;
public class MysteryNumber {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int computerChoice = (int)(Math.random() *11);
	//System.out.println(computerChoice);

System.out.print("Guess a number from 0 to 10: ");	
	int guesser = input.nextInt();
	
	if (guesser > computerChoice) { 
System.out.println("Is higher. try again: "); 
	guesser = input.nextInt(); }
	if (guesser < computerChoice) {
System.out.println("Is lower. try again: "); 
	guesser = input.nextInt(); }

	if (guesser > computerChoice) {
System.out.println("Is higher. try again: "); 
	guesser = input.nextInt(); }
	if (guesser < computerChoice) {
System.out.println("Is lower. You loss: "); 
	guesser = input.nextInt(); }

	if (guesser == computerChoice) {
System.out.print("You won"); }
	if (guesser > computerChoice) {
System.out.println("Is higher. Last trial"); }
	if (guesser < computerChoice) {
System.out.println("Is lower. Last trial"); }

















}
}