import java.util.Scanner;
public class Mainclass {

	public static void main(String[] args) {
		BottleDispenser dispenser = new BottleDispenser();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while(true) {
			System.out.println();
			System.out.println("*** BOTTLE DISPENSER ***");
			System.out.println("1) Add money to the machine");
			System.out.println("2) Buy a bottle");
			System.out.println("3) Take money out");
			System.out.println("4) List bottles in the dispenser");
			
			System.out.println("0) End");
			System.out.print("Your choice: ");
			choice = scan.nextInt();
			
			if(choice == 1) {
				dispenser.addMoney();
			}else if(choice == 2) {
				dispenser.buyBottle();
			}else if(choice == 3) {
				dispenser.returnMoney();
			}else if(choice == 4) {
				dispenser.listBottles();
			}else if(choice == 0) {
				scan.close();
				break;
			}else {
				System.out.println("Unknown input.");
			}
		}
	}

}
