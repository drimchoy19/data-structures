
public class Car {
	
	private String brand;
	private String model;
	private int year;
	private double price;
	private int power;
	
	public Car() {
		
		this.brand = "No brand";
		this.model = "No model";
		this.year = -1;
		this.price = -1;
		this.power = -1;
		
	}
	
	public Car(String b,String m,int y,double p,int pow) {
		
		this.brand = b;
		this.model = m;
		this.year = y;
		this.price = p;
		this.power = pow;
		
	}
	
	public Car[] initCars() {
		//13
		Car[] arr = new Car[13];
		
		arr[0] = new Car("Mercedes","E CLASS",17000,2006,306);
		arr[1] = new Car("BMW","5 SERIE",10999,2003,286);
		arr[2] = new Car("Audi","A6",9999,2005,223);
		arr[3] = new Car("Mercedes","S CLASS",23500,2007,388);
		arr[4] = new Car("Mercedes","C CLASS",7000,2003,143);
		arr[5] = new Car("BMW","3 SERIE",5000,2003,150);
		arr[6] = new Car("Peugeot","307",4700,2001,90);
		arr[7] = new Car("BMW","5 SERIE",10999,2003,286);
		arr[8] = new Car("Audi","A8",17000,2005,321);
		arr[9] = new Car("Mercedes","E CLASS",23500,2009,388);
		arr[10] = new Car("Mercedes","C CLASS",15000,2007,170);
		arr[11] = new Car("BMW","3 SERIE",5000,2003,150);
		arr[12] = new Car("Peugeot","3008 GT LINE",66000,2001,177);
		
		return arr;
		
		
	}
	
	@Override
	public String toString() {
		
		return this.brand+" "+this.model+" ";
		
	}

	protected String getBrand() {
		return brand;
	}

	protected void setBrand(String brand) {
		this.brand = brand;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected int getYear() {
		return year;
	}

	protected void setYear(int year) {
		this.year = year;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	protected int getPower() {
		return power;
	}

	protected void setPower(int power) {
		this.power = power;
	}
	
	

}
