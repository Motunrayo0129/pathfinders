import java.util.Scanner;
public class NokiaMenu2 {
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
 press 14 to quit
""";
	System.out.println(display);

	Scanner input = new Scanner(System.in);
	System.out.print("Enter menu number: ");
	int userInput = input.nextInt();
		
	switch(userInput)  {
			
		case 1: {
			String phoneBook = """ 
			1. Search
			2. Service Nos
			3. Add name			
			4. Erase
			5. Edit
			6. Assign tone			
			7. Send b'card
			8. Options 
			9. Speed dials
			10. voice tags 
				""";
			System.out.println(phoneBook);
			System.out.print("Press 8 to enter option: ");
			int options = input.nextInt();
				switch(options) {
				case 8 : 
					 System.out.println("  1.Type of view ");
					  System.out.println("  2. Memory Status" ); 
				default : System.out.println("invalid"); 
			}
			System.out.print("Enter 1 to go back phonebook or 0 to menu: ");
				int bby = input.nextInt();
				if (bby == 1) {
				System.out.print(phoneBook); }
				else if (bby == 0) {
				System.out.print(display); }
				else {
				System.out.println("Bye!"); }

         	   }  break;
			case 2: {
			String Messages = """
			1. Write messages
			2. Inbox
			3. Outbox
			4. Picture messages
			5. Templates
			6. Smileys
			7. Message setting 
			8. Info service
			9. Voice mailbox number
			10. Service command editor
				""";
				System.out.print(Messages);
			System.out.print("press 1 or 2 for message setting(7): ");
				int settings = input.nextInt();
			switch(settings)  {
				case 1 : {
				System.out.println(" SET 1  ");
				System.out.println("  1. Messages centre number");
				System.out.println("  2. Mssages sent as");
				System.out.println("  3. Message validity");  }  break;

				case 2 : {
					System.out.println("COMMON  ");				
					System.out.println("1. Delivery reports");
					System.out.println("2. Reply via same centre");
					System.out.println("3. Character support"); }
						 }
			System.out.print("Enter 1 to go back messages or 0 to menu: ");
				int boy = input.nextInt();
				if (boy == 1) {
				System.out.print(Messages); }
				else if (boy == 0) {
				System.out.print(display); }
				else {
				System.out.println("Bye!"); }

				} break;
		 
		case 3: {
			System.out.println("CHAT"); 
			System.out.println("Enter (0) to go back to menu: ");
					 int chat= input.nextInt();
					if (chat == 0)
					System.out.println(display); 

					else {
					System.out.println("Bye!"); }
						} break;  

		case 4: {
				String CallRegister = """
				1. Missed call
				2. Received call
				3. Dialled numbers
				4. Erase recent call lists
				5. Show call duration
				6. Show call costs  
				7. Call cost settings  
				8. Prepaid credit
				       """;
				System.out.println(CallRegister);							
				System.out.print("press 5 to show call duration or 0 to next:");
					int duration = input.nextInt();
				switch (duration) {
					case 5 : 
				System.out.println("  1. Last call duration");
				System.out.println("  2. All calls' duration");
				System.out.println("  3. Received calls' duration");                  
				System.out.println("  4. Dialled calls' duration");
				System.out.println("  5. Clera timers"); }
			
				System.out.print("Press 6 to show call cost or 0 to next: ");
					int costs= input.nextInt();
				switch (costs) {
					case 6 :
					System.out.println("  1. Last call cost");
					System.out.println("  2. All calls' cost");
					System.out.println("  3. Clear counters");
					 }
				System.out.print("Press 7 for call cost settings or 0 to next: ");
					int cost = input.nextInt();
				switch (cost) {
					case 7:
				System.out.println("  1. Call cost limit");
				System.out.println("  2. Show cost in"); }

 				System.out.print("Enter 1 to go back to call register or 0 to menu: ");
				int boy = input.nextInt();
				if (boy == 1) {
				System.out.print(CallRegister); }
				else if (boy == 0) {
				System.out.print(display); 
					}
				else {
				System.out.println("Bye!"); }
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

			System.out.print("Enter (0) to go back to menu or (1) to exit: ");
					 int tone = input.nextInt();
					if (tone == 0)
					System.out.println(display); 

					else {
					System.out.println("Bye!"); }
			} break;

		case 6 : {
			String Settings = """
				1. Call  settings
				2. Phone settings
				3.Security settings
				4.Restore factory settings
					""";
				System.out.println(Settings);
			System.out.print("Enter 1 for call settings: ");	
	          			 int callSettings = input.nextInt(); 
			switch(callSettings) {
				case 1: {
			System.out.println("  1. Autonomial redial");
			System.out.println("  2. Speed dialing");
			System.out.println("  3. Call waiting options");
			System.out.println("  4. Own number sending");
			System.out.println("  5. Phone line in use");
			System.out.println("  6. Automatic answer"); }
				System.out.print("Enter 2 for phone settings or 0 to next: ");
					int phoneSettings = input.nextInt();
				switch(phoneSettings)	{		
				case 2: 
			System.out.println("PHONE SETTINGS");
			System.out.println("  1. Language");
			System.out.println("  2. Cell info display");
			System.out.println("  3. Welcome note");
			System.out.println("  4. Network selection");
			System.out.println("  5. Lights");
			System.out.println("  6. Confirn SIM service actions"); }

			System.out.print("Enter 3 for security settings or 0 to next: ");
					int securitySettings = input.nextInt();
				switch(securitySettings) {				
				case 3: 
			System.out.println("SECURITY SETTINGS");
			System.out.println("  1. Pin code request");
			System.out.println("  2. Call barring service");
			System.out.println("  3. Fixed dialling");
			System.out.println("  4. Closed user group");
			System.out.println("  5. Phone security");
			System.out.println("  6. Change access codes"); }
 
			System.out.print("Enter (0) to go back to menu or (1) to settings: ");
					int secure = input.nextInt();
					if (secure == 0) {
					System.out.println(display); }
					if (secure == 1){
					System.out.print(Settings); }
					else {
					System.out.print("Bye!"); }
						}
                                     } break;

			
		case 7: {
			System.out.println("CALL DIVERT"); 

			System.out.print("Enter (0) to go back to menu or (1) to exit: ");
					 int divert = input.nextInt();
					if (divert == 0)
					System.out.println(display); 

					else {
					System.out.println("Bye!"); }
                           } break;

		case 8: {
			System.out.println("GAMES");

			System.out.println("Enter (0) to go back to menu  ");
					 int games= input.nextInt();
						} break;

		case 9: {
			System.out.println("CALCULATORS"); 

			System.out.print("Enter (0) to go back to menu or (1) to exit: ");
					 int calculator = input.nextInt();
					if (calculator == 0)
					System.out.println(display); 

					else {
					System.out.println("Bye!"); }
                } break;

		case 10: {

			System.out.println("REMINDERS");

			System.out.print("Enter (0) to go back to menu or (1) to exit: ");
					 int reminder = input.nextInt();
					if (reminder == 0)
				System.out.println(display); 

					else {
					System.out.println("Bye!"); }
             }  break;
		case 11: {
			System.out.println("CLOCK");
			System.out.println("  1. Alarm clock");
			System.out.println("  2. Clock settings");
			System.out.println("  3. Date setting");
			System.out.println("  4. Stop watch");
			System.out.println("  5. Countdown timer");
			System.out.println("  6. Auto update of date and time"); 

			System.out.print("Enter (0) to go back to menu or (1) to exit: ");
					int clock  = input.nextInt();
					if (clock == 0)
					System.out.println(display); 

					else {
					System.out.print("Bye!"); }
                          } break;
		case 12: {
			System.out.println("PROFILES"); 

			System.out.print("Enter (0) to go back to menu or (1) to exit: ");
					 int zero = input.nextInt();
					if (zero == 0)
					System.out.println(display); 

					else {
					System.out.print("Bye!");  }
				
                                } break;
				
        		
             		case 13: {
			System.out.print("SIM SERVICES");

			System.out.print("Enter (0) to go back to menu or (1) to exit: ");
					int menu = input.nextInt();
					if (menu == 0)
					System.out.println(display); 

					else {
					System.out.print("Bye!"); }
                    
						} break;
				default : {
						
					System.out.print("Invalid input");  
					System.out.println(display); }break;

} 


  }
   }