
public class Person {
	
	static int count=1;
	private int id;
	private int age;
	private String name;
	
	public Person() {
		
		this.id = -1;
		this.name = "";
		this.age = 0;
		
	}
	public Person(String name,int age) {
		
		this.id = count++;
		this.name = name;
		this.age = age;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void setAge(int age) {
		
		this.age = age;
		
	}
	
	public int getAge() {
		
		return this.age;
		
	}
	
	public int getId() {
		
		return this.id;
		
	}
	
	@Override
	public String toString() {
		
		String str = "Name:"+this.name+" Age:"+this.age+" ID:"+this.id;
		
		return str;
	}
	
	
	
	
	

}
