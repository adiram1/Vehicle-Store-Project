package VehicleStore;

public class Truck extends Car {
	private int maxWeight;
	private double len;

	public Truck(String licenseNum, String company, int year, int price, int numOfWheels, int numOfSeats,
			int fuelPerLitre, boolean isElectric, int maxWeight, double len) {
		super(licenseNum, company, year, price, numOfWheels, numOfSeats, fuelPerLitre, isElectric);
		this.maxWeight = maxWeight;
		this.len = len;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getLen() {
		return len;
	}

	public void setLen(double len) {
		this.len = len;
	}

	public void printLicenseNum() {
		System.out.println("This is Truck");
		super.printLicenseNum();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Truck [maxWeight=" + maxWeight + ", len=" + len + "]";
	}
	
	
	
	
}
