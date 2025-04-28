import java.util.Scanner;
public class InvalidScore2 {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	

	int counterA = 0; 
	int counterB = 0;
	int counterC = 0;		
	int counterD = 0; 
	int counterF = 0; 
	int counterInvalid = 0; 
 

		int validCounter = 1;
	while(validCounter <= 10) {
	

		System.out.print("Enter student's grade: ");
		int grade = input.nextInt();

	if (grade < 0 || grade >= 101){
		System.out.println("Invalid Input");
			counterInvalid++;

	} 
	
	switch(grade / 10)  {
	case 8, 9, 10:
		System.out.println("Grade A");
			validCounter++;
			 counterA++;
				break;
	case 7:
		System.out.println("Grade B");
			validCounter++; 
			counterB++;
				break;
	case 6:
		System.out.println("Grade C");
			validCounter++; 
				counterC++;
				break;
	case 5:
		System.out.println("Grade D");
			validCounter++; 
			counterD++;
				break;
	case 4, 3, 2, 1, 0:
		System.out.println("Grade F");
			validCounter++; 
			counterF++;
				break;


	} 
	   }
	System.out.println("The total number of A " + counterA++);
	System.out.println("The total number of B " + counterB++);
	System.out.println("The total number of C " + counterC++);
	System.out.println("The total number of D " + counterD++);
	System.out.println("The total number of F " + counterF++);
	System.out.println("The total number of Invalid Input " + counterInvalid++);

















}
}