
public class Bottle {
	private String name;
	private String manufacturer;
	private double total_energy;
	private double price;
	private double size;
	public Bottle() {
		
	}
	
	public Bottle(String name1, String manuf, double totE, double price1, double size1) {
		this.name = name1;
		this.manufacturer = manuf;
		this.total_energy = totE;
		this.price = price1;
		this.size = size1;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public double getTotalEnergy() {
		return this.total_energy;
	}
	
	public double getSize() {
		return this.size;
	}
}
