
public class Property {
	
	private String ownerName;
	private int size;
	private	double latitude;
	private double longtitude;
	private double price;
	
	public Property() {
		
		this.ownerName = null;
		this.size = 0;
		this.latitude = -1000;
		this.latitude = -1000;
		this.price = 0;
		
	}
	
	public Property(String name,int size,double latitude,
			double longtitude,double price) {
		
		this.ownerName = name;
		this.size = size;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.price = price;

	}
	
	public Property[] initProperties() {
		
		Property[] arr = new Property[7];
		arr[0] = new Property("Gosho",500,21.32,21.27,119999.99);
		arr[1] = new Property("Ivan",320,25.32,21.27,77777.99);
		arr[2] = new Property("Petko",350,24.32,42.27,88888.99);
		arr[3] = new Property("Angel",270,24.32,23.27,111111.99);
		arr[4] = new Property("Maria",450,84.32,21.27,123123.99);
		arr[5] = new Property("Ivanka",300,24.32,33.27,50000);
		arr[6] = new Property("Gosho1",500,44.32,21.27,123000);
		
		return arr;
		
	}

	protected String getOwner() {
		return ownerName;
	}

	protected void setOwner(String owner) {
		this.ownerName = owner;
	}

	protected int getSize() {
		return size;
	}

	protected void setSize(int size) {
		this.size = size;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}


	protected double getLatitude() {
		return latitude;
	}

	protected double getLongtitude() {
		return longtitude;
	}
	
	
}
