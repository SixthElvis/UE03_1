
public class TicketingUE03 {

	public static void main(String[] args) {
		//variable declaration
		int ticketsLeft = 30;
		int ticketsPurchase = 0;
		double ticketPrice = 9.90;
		double moneyEarned = 0;
		byte menuInput = 1;

		// printing out menu options
		// you could put these into the while loop to repeat them whenever user goes back to main menu
		System.out.printf("Main Menu:%n");
		System.out.printf("  1) Sell Tickets%n");
		System.out.printf("  2) Show Tickets Left%n");
		System.out.printf("  3) Show Balance%n");
		System.out.printf("  0) Exit%n");
		// with this main menu keeps repeating until user inputs 0 to exit
		while (menuInput != 0) {	
			System.out.print("Enter menu function: ");
			menuInput = Input.readByte();
			switch (menuInput) {	
			// menu function 0 ends the program
			case 0:	
				System.out.println("Bye!");
				break;
			// starts ticket selling at least once and repeats until user inputs 0 to end ticket selling
			case 1:	
				do {	
					System.out.println("Enter amount of tickets to be bought: ");
					ticketsPurchase = Input.readInt();
					if (ticketsPurchase == 0) {	// if user given ticket amount is 0 the ticket selling ends
						break;
					}
					// checks if enough tickets are available, then calculates tickets left, balance and prints out sell price
					if (ticketsPurchase <= ticketsLeft) {	
						ticketsLeft = ticketsLeft - ticketsPurchase;
						moneyEarned = (float)(ticketsPurchase * ticketPrice + moneyEarned);
						System.out.print("Sell Price: ");
						System.out.printf("%.2f €%n",(float)(ticketPrice * ticketsPurchase));
					} else { // if not enough tickets available an error is printed out and user is asked for new ticket amount
						System.out.println("Not enough tickets available.");
					}
				}
				while (ticketsPurchase != 0);
				break;
			// prints out the amount of left tickets
			case 2:
				System.out.println(ticketsLeft+" tickets left.");
				break;
			// prints out the current cash balance
			case 3:
				System.out.printf("The cash register contains %.2f",moneyEarned);
				System.out.println(" €");
				break;
			// if user input in main menu is not 0-3 error is printed out and user is asked for new input
			default:
				System.out.println("Unknown menu function, please try again.");
			}
		}
	}
}
