import java.util.Scanner;

public class Testing {

	public static void main(String [] args) {
		

		Person tmp = new Person();
		Car tmpC = new Car();
		Person[] p = tmp.initPersons();
		Car[] cars = tmpC.initCars();
		
		//System.out.println(tmp.getClass());
		System.out.println("| 1 - LinkedList | 2 - Queue | 3 - Stack |");
		int a = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		String in = "";
		String out = "";
		switch (a) {
		
		case 1 :
			
			System.out.println("LinkedList");
			
			LinkedList<Person> ll = new LinkedList<Person>(p);
			LinkedList<Car> ll2 = new LinkedList<Car>(cars);
			for(int i=0;i<p.length;i++) {
				
				in += p[i].toString();
				
			}
			
			System.out.println("IN");
			System.out.println(in);
			System.out.println("Size:"+ll.size());
			System.out.println("RemoveFirst - "+ll.removeFirst().toString());
			while(ll.isEmpty()!=true) {
				//?
				tmp = ll.removeFirst();
				out += tmp.toString();
				
			}
			
			System.out.println(out);
			
			break;
			
		case 2 :
			
			System.out.println("Queue FIFO");
			System.out.println("IN ORDER");
			in = "";
			for(int i = 0;i<p.length;) {
				tmp = p[i];
				in += tmp.toString()+" ";
				i++;
				
			}
			System.out.println(in);
			Queue<Person> q = new Queue<Person>(p);
			
			System.out.println(q.size());
			System.out.println("OUT ORDER");
			 out = "";
			while(q.isEmpty()!=true) {
				
				tmp = q.deqeue();
				out += tmp.toString()+" | ";
				
			}
			
			System.out.println(out);
			System.out.println(q.size());
			
			break;
			
		case 3 :
			System.out.println("Stack LIFO");
			
			Stack<Person> st2 = new Stack<Person>(p);
			in = "";
			for(int i = 0;i<p.length;) {
				tmp = p[i];
				in += tmp.getId()+"-"+tmp.getName()+" ";
				i++;
				
			}
			System.out.println(in);
			System.out.println(st2.size());
			out = "";
			while(st2.isEmpty()!=true) {

				tmp = st2.pop();
				out += tmp.getId()+"-"+tmp.getName()+" ";
				
			
			}
			System.out.println(out);
			System.out.println(st2.size());
			break;
			
			default :
				
				System.out.println("Wrong choice");
				break;
		
		}
		
		
	}
	
	
}

