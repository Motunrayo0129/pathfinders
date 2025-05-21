import java.util.Scanner;
public class RandomTest {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int computerChoice = (int)(Math.random() * 3);
	 System.out.println(computerChoice);

	int lose = 0;
	int winner = 0;
	
	while(winner - lose != 3 && lose - winner != 3){

System.out.print("Guess a number from 0 to 2: ");
	int msGuess = scanner.nextInt();

	if (msGuess == 0 && computerChoice == 1) {
System.out.print("The computer is rock. You are scissor. You lose\n");
	lose++;   }

	if (msGuess == 0 && computerChoice == 2) {	
System.out.print("The computer is paper. You are scissor. You won\n");
	winner = winner + 1;
}
	if (msGuess == 2 && computerChoice == 2)	{
Syst em.out.print("The computer is paper. You are paper. is draw\n"); }
												
	if (msGuess == 2 && computerChoice == 1) {	
System.out.print("The computer is rock. You are paper. You won\n"); 
		lose++; }

	if (msGuess == 1 && computerChoice == 1)	{
System.out.print("The computer is rock. You are rock. is draw\n"); }	

	if (msGuess == 0 && computerChoice == 0) {	
System.out.print("The computer is rock. You are rock. is draw\n"); }

	if (msGuess == 1 && computerChoice == 0) {	
System.out.print("The computer is scissor. You are rock. You won\n"); 
	winner = winner + 1;  }

	if (msGuess == 2 && computerChoice == 0)  {	
System.out.print("The computer is scissor. You are paper. You lose\n"); 
 		lose++;  }

	if (msGuess == 1 && computerChoice == 2) {	
System.out.print("The computer is paper. You are rock. You lose\n");
		lose++;  }
	
	

}

















}       
}  

       
