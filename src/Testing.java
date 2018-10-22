
public class Testing {

	public static void main(String [] args) {
		
		System.out.println("Hello");
		Person p1 = new Person("Gosho",22);
		Person p2 = new Person("Ivan",23);
		Person p3 = new Person();
		System.out.println(p1.getId()+"/"+p2.getId()+"/"+p3.getId());
		
	}
}
