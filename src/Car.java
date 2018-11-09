
public class Car {
	
	private String brand;
	private String model;
	private int year;
	private int price;
	private int power;
	
	public Car() {
		
		this.brand = "No brand";
		this.model = "No model";
		this.year = -1;
		this.price = -1;
		this.power = -1;
		
	}
	
	public Car(String b,String m,int y,int p,int pow) {
		
		this.brand = b;
		this.model = m;
		this.year = y;
		this.price = p;
		this.power = pow;
		
	}
	
	public Car[] initCars() {
		
		Car[] arr = new Car[3];
		
		arr[0] = new Car("Mercedes","E CLASS",17000,2006,306);
		arr[1] = new Car("BMW","5 SERIE",10999,2003,286);
		arr[2] = new Car("Audi","A6",9999,2005,223);
		
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

	protected int getPrice() {
		return price;
	}

	protected void setPrice(int price) {
		this.price = price;
	}

	protected int getPower() {
		return power;
	}

	protected void setPower(int power) {
		this.power = power;
	}
	
	

}
