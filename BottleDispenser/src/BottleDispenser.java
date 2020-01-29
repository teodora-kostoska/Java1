import java.util.ArrayList;
import java.util.Scanner;
public class BottleDispenser {
	private int bottles;
	private double money;
	private ArrayList<Bottle> bottleArray; 
	public BottleDispenser() {
		this.bottles = 5;
		this.money = 0.00;
		bottleArray = new ArrayList<Bottle>();
		
		bottleArray.add(new Bottle("Pepsi Max", "Pepsi", 0.3, 1.8, 0.5));
		bottleArray.add(new Bottle("Pepsi Max", "Pepsi", 0.3, 2.2, 1.5));
		bottleArray.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3, 2.0, 0.5));
		bottleArray.add(new Bottle("Coca-Cola Zero", "Coca-Cola", 0.3, 2.5, 1.5));
		bottleArray.add(new Bottle("Fanta Zero", "Fanta", 0.3, 1.95, 0.5));
	}
	
	public void addMoney() {
		this.money+= 1.00;
		System.out.println("Klink! Added more money!");
	}
	
	public void buyBottle() {
		listBottles();
		Scanner scan = new Scanner(System.in);
		System.out.print("Your choice: ");
		int choice = scan.nextInt();
		if(this.money <= bottleArray.get(choice-1).getPrice()) {
			System.out.println("Add money first!");
		}else if(bottles <= 0){
			System.out.println("No more bottles!");
		}else {
			this.bottles--;
			this.money -= bottleArray.get(choice-1).getPrice();
			System.out.println("KACHUNK! " + bottleArray.get(choice-1).getName() +" came out of the dispenser!");
			removeBottle(choice-1);
		}
	}
	
	public void removeBottle(int index) {
		this.bottleArray.remove(index);
	}
	
	public void listBottles() {
		for(int i = 0; i < bottleArray.size(); i++) {
			System.out.println(i+1 + ". Name: " + bottleArray.get(i).getName());
			System.out.println("	Size: " + bottleArray.get(i).getSize() + "	Price: "+ bottleArray.get(i).getPrice());
		}
	}
	
	public void returnMoney() {
		String left = String.format("%.2f", this.money);
		left = left.replace(".", ",");
		System.out.println("Klink klink. Money came out! You got " + left + "€ back");
		this.money = 0;
	}
}
