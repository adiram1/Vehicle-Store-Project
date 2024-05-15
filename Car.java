package VehicleStore;

public class Car extends Vehicle {
	protected int numOfSeats;
	protected int fuelPerLitre;
	protected boolean isElectric;

	public Car(String licenseNum, String company, int year, int price, int numOfWheels, int numOfSeats,
			int fuelPerLitre, boolean isElectric) {
		super(licenseNum, company, year, price, numOfWheels);
		this.numOfSeats = numOfSeats;
		this.fuelPerLitre = fuelPerLitre;
		this.isElectric = isElectric;
	}

	public boolean isElectric() {
		return isElectric;
	}

	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public int getFuelPerLitre() {
		return fuelPerLitre;
	}

	public void setFuelPerLitre(int fuelPerLitre) {
		this.fuelPerLitre = fuelPerLitre;
	}
	
	public void printLicenseNum() {
		System.out.println("This is Car");
		super.printLicenseNum();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Car [numOfSeats=" + numOfSeats + ", fuelPerLitre=" + fuelPerLitre + "]";
	}
	
	
}
