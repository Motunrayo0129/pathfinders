import java.util.Scanner;
public class NokiaMenu {
	public static void main (String[] args) {

String display = """
NOKIA LIST OF MENU FUNCTIONS. PRESS
1. Phone book
2. Messages
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Games
9. Calculator
10. Reminders
11. Clock
12. Profiles
13. SIM services
""";

	System.out.println(display);

	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	int userInput = input.nextInt();

	switch(userInput)  {
		case 1: {
			System.out.println("PHONE BOOK"); 
			System.out.println("1. Search");
			System.out.println("2. Service Nos");
			System.out.println("3. Add name");			
			System.out.println("4. Erase");
			System.out.println("5. Edit");
			System.out.println("6. Assign tone");			
			System.out.println("7. Send b'card");
			System.out.println("8. Options ");
				int options = input.nextInt();
				switch(options) {
				case 8 : 
					 System.out.println("  1.Type of view ");
					  System.out.println("  2. Memory Status" ); 
				default : System.out.println("invalid"); 
			}
			System.out.println("9. Speed dials");
			System.out.println("10. voice tags"); 

				
         	   }  break;
		

		case 2 : {
			System.out.println("MESSAGES"); 
			System.out.println("1. Write messages");
			System.out.println("2. Inbox");
			System.out.println("3. Outbox");
			System.out.println("4. Picture messages");
			System.out.println("5. Templates");
			System.out.println("6. Smileys");
			System.out.println("7. Message setting  ");
				int settings = input.nextInt();
			switch(settings)  {
				case 1 : 
				System.out.println(" SET 1  ");
				System.out.println("  1. Messages centre number");
				System.out.println("  2. Mssages sent as");
				System.out.println("  3. Message validity");

				case 2 : 
					System.out.println("COMMON  ");				
					System.out.println("1. Delivery reports");
					System.out.println("2. Reply via same centre");
					System.out.println("3. Character support"); 

				 default : System.out.println("invalid"); }
				
				System.out.println("8. Info service");
				System.out.println("9. Voice mailbox number");
				System.out.println("10. Service command editor");

				} break;
		 
		case 3: {
			System.out.println("CHAT"); } break;  

		case 4: {
				System.out.println("CALL REGISTER");
				System.out.println("1. Missed call");
				System.out.println("2. Received call");
				System.out.println("3. Dialled numbers");
				System.out.println("4. Erase recent call lists");
				System.out.println("5. Show call duration   ");
					int duration = input.nextInt();
				switch (duration) {
					case 1 : 
				System.out.println("  1. Last call duration");
				System.out.println("  2. All calls' duration");
				System.out.println("  3. Received calls' duration");
				System.out.println("  4. Dialled calls' duration");
				System.out.println("  5. Clera timers");
				default : System.out.println("invalid");  }

				System.out.println("6.Show call costs  ");
					int costs= input.nextInt();
				switch (costs) {
					case 1 :
					System.out.println("  1. Last call cost");
					System.out.println("  2. All calls' cost");
					System.out.println("  3. Clear counters");
					default : System.out.println("invalid"); 
				System.out.println("7. Call cost settings   "); }
					int cost = input.nextInt();
				switch (cost) {
					case 1:
				System.out.println("  1. Call cost limit");
				System.out.println("  2. Show cost in"); 
				default : System.out.println("invalid");  }

				System.out.println("8. Prepaid credit");

			} break;

		case 5: {
			System.out.println("TONES");
			System.out.println("  1. Ringing tones"); 
			System.out.println("  2. Ringing volume");
			System.out.println("  3. Incoming call alert");
			System.out.println("  4. Composer");
			System.out.println("  5. Messages alert tone");
			System.out.println("  6. Keypad tones");
			System.out.println("  7. Warning and games tones");
			System.out.println("  8. Vibrating alert ");
			System.out.println("  9. Screen saver ");

			}break;
		case 6 : {
			System.out.println("SETTINGS");
			System.out.println("  1. Call s settings");
				int callSettings = input.nextInt(); 
			switch(callSettings) {
				case 1: 
			System.out.println("  1. Autonomial redial");
			System.out.println("  2. Speed dialing");
			System.out.println("  3. Call waiting options");
			System.out.println("  4. Own number sending");
			System.out.println("  5. Phone line in use");
			System.out.println("  6. Automatic answer"); 

				case 2: 
			System.out.println("PHONE SETTINGS");
			System.out.println("  1. Language");
			System.out.println("  2. Cell info display");
			System.out.println("  3. Welcome note");
			System.out.println("  4. Network selection");
			System.out.println("  5. Lights");
			System.out.println("  6. Confirn SIM service actions"); 

				case 3: 
			System.out.println("SECURITY SETTINGS");
			System.out.println("  1. Pin code request");
			System.out.println("  2. Call barring service");
			System.out.println("  3. Fixed dialling");
			System.out.println("  4. Closed user group");
			System.out.println("  5. Phone security");
			System.out.println("  6. Change access codes");  

				case 4: 
			System.out.println("RESTORE FACTORY SETTINGS"); }
			  
				} break;
		case 7: {
			System.out.println("CALL DIVERT"); } break;

		case 8: {
			System.out.println("GAMES"); } break;

		case 9: {
			System.out.println("CALCULATORS"); } break;

		case 10: {

			System.out.println("  4. Network selection"); }  break;
		case 11: {
			System.out.println("CLOCK");
			System.out.println("  1. Alarm clock");
			System.out.println("  2. Clock settings");
			System.out.println("  3. Date setting");
			System.out.println("  4. Stop watch");
			System.out.println("  5. Countdown timer");
			System.out.println("  6. Auto update of date and time"); } break;
		case 12: {
			System.out.println("PROFILES"); } break;
				
 		
		case 13: {
			System.out.print("SIM SERVICES");

		} break;
	



}









  }
     }