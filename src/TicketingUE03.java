
public class TicketingUE03 {

	public static void main(String[] args) {
		int ticketsLeft = 30;
		int ticketsPurchase = 0;
		double ticketPrice = 9.90;
		double moneyEarned = 0;
		byte menuInput = 1;
		
		while (menuInput != 0) {
			System.out.println("Enter menu function: ");
			menuInput = Input.readByte();
			
			switch (menuInput) {
			case 0:
				System.out.println("Bye!");
				break;
			case 1:
				System.out.println("Enter amount of tickets to be bought: ");
				ticketsPurchase = Input.readInt();
				if (ticketsPurchase <= ticketsLeft) {
					ticketsLeft = ticketsLeft - ticketsPurchase;
					moneyEarned = Math.round(ticketsPurchase * ticketPrice + moneyEarned);
					System.out.print("Sell Price: ");
					System.out.println(Math.round(ticketPrice * ticketsPurchase));;
					
				}
				break;
				default:
					System.out.println("blah");
			}
		}
	}

}
