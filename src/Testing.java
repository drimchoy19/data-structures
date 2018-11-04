
public class Testing {

	public static void main(String [] args) {
		
		System.out.println("Hello");
		Person p1 = new Person("Gosho",22);
		Person p2 = new Person("Ivan",23);
		Person p3 = new Person("Gosho2",22);
		Person p4 = new Person("Ivan2",23);
		Person p5 = new Person();
		System.out.println(p1.getId()+"/"+p2.getId()+"/"+p3.getId());
		
		LinkedList ll = new LinkedList();
		LinkedList ll2 = new LinkedList();
		
		ll.add(p1);
		ll.add(p2);
		ll.add(p3);
		ll.removeLast();
		ll.add(p4);
		//ll.add(p5);
		System.out.println(Person.count);
		System.out.println(ll.size());
		while(ll.isEmpty()!=true) {
			
			System.out.println(ll.removeLast().getName());
			
		}
	}
}
