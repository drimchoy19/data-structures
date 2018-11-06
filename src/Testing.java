
public class Testing {

	public static void main(String [] args) {
		
		System.out.println("Hello");
		Person[] p = new Person[7];
		p[0] = new Person("Gosho",22);
		p[1] = new Person("Ivan",23);
		p[2] = new Person("Gosho",24);
		p[3] = new Person("Ivan",43);
		p[4] = new Person("Petkan",33);
		p[5] = new Person("Shestkan",26);
		p[6] = new Person("Sedemkan",27);
		
		LinkedList ll = new LinkedList();
		
		ll.add(p[0]);
		ll.add(p[1]);
		ll.add(p[2]);
		ll.removeLast();
		ll.add(p[3]);
		//ll.add(p5);
		System.out.println(Person.count);
		System.out.println(ll.size());
		while(ll.isEmpty()!=true) {
			
			System.out.println(ll.removeLast().getName());
			
		}
		
		Queue q = new Queue(p);

		Person[] arr = q.toArray();
		for(Person tmp : arr) {
			
			System.out.println(tmp.toString());
		}
		System.out.println(q.size());
		while(q.isEmpty()!=true) {
			
			System.out.println(q.deqeue().getId());
			
		}
		
	}
}
