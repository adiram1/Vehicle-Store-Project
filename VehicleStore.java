package VehicleStore;

import java.util.Arrays;

public class VehicleStore {
	private String name;
	private Vehicle[] vehicles;
	private int cnt;
	private int monthSales;

	public VehicleStore(String name, Vehicle[] vehicles, int cnt, int monthSales) {
		super();
		this.name = name;
		this.vehicles = vehicles;
		this.cnt = cnt;
		this.monthSales = monthSales;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonthSales() {
		return monthSales;
	}

	public void setMonthSales(int monthSales) {
		this.monthSales = monthSales;
	}
	
	public boolean addVehicle(Vehicle v) {
		if(v==null) return false;
		for(int i=0;i<cnt;i++) 
			if(vehicles[i].toString().equals(v.toString())) return false;
		vehicles = Arrays.copyOf(vehicles, cnt+1);
		vehicles[cnt++] = v;
		v.setVehicleStore(this);
		return true;
	}
	
	public boolean removeVehicle(Vehicle v) {
		if(v==null) return false;
		boolean flag = false;
		for(int i=0;i<cnt;i++) {
			if(vehicles[i].toString().equals(v.toString())) {
				flag = true;
				break;
			}
		}
		if(!flag) return false;
		Vehicle[] temp = new Vehicle[cnt-1];
		int cnt = 0;
		for(int i=0;i<this.cnt;i++) {
			if(!vehicles[i].toString().equals(v.toString()))
				temp[cnt++] = vehicles[i];
		}
		vehicles = temp;
		this.cnt--;
		v.setVehicleStore(null);
		return true;
	}
	
	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public int getCnt() {
		return cnt;
	}
	
	
}
