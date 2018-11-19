import java.io.IOException;
import java.util.Scanner;

public class Testing {

	public static void main(String [] args){
		

		Person tmp = new Person();
		Person[] p = tmp.readFromFile();//tmp.initPersons();
		//tmp.writeInFile(p);
		//Car tmpC = new Car();
		//Car[] cars = tmpC.initCars();
		
		System.out.println("| 1 - LinkedList | 2 - Queue | 3 - Stack |");
		int a = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		String in = "";
		String out = "";
		switch (a) {
		
		case 1 :
			
			LinkedList<Person> ll = new LinkedList<Person>();
			
			for(int i=0;i<p.length;i++) {
				
				ll.add(p[i]);
				in += p[i].getId()+" | ";//toString()+" ";
				
			}

			System.out.println("LinkedListData");
			ll.show();
			System.out.println("isEmpty-"+ll.isEmpty());
			System.out.println("LinkedList size-"+ll.size());
			System.out.println("Remove 4 elements");
			System.out.println(ll.remove(5).toString());
			System.out.println(ll.remove(7).toString());
			System.out.println(ll.remove(11).toString());
			System.out.println(ll.remove(15).toString());
			System.out.println("Size after remove-"+ll.size());
			
			ll.show();
			
			System.out.println("RemoveLast - "+ll.removeLast());
			System.out.println("RemoveFirst - "+ll.removeFirst().toString());
			System.out.println("Size:"+ll.size());
			
			//ll.show();

			System.out.println("IN id's");
			System.out.println(in);
			while(ll.isEmpty()!=true) {
				
				ll.removeFirst();
				
			}
			System.out.println("isEmpty-"+ll.isEmpty());
			
			break;
			
		case 2 :
			
			System.out.println("Queue FIFO(First In First Out)");
			System.out.println("IN ORDER id's");
			in = "";
			for(int i = 0;i<p.length;) {
				tmp = p[i];
				in += tmp.getId()+" | ";//toString()+" ";
				i++;
				
			}
			System.out.println(in);
			Queue<Person> q = new Queue<Person>(p);
			
			System.out.println("OUT ORDER id's");
			 out = "";
			while(q.isEmpty()!=true) {
				
				tmp = q.deqeue();
				out += tmp.getId()+" | ";//toString()+" | ";
						
				
			}
			
			System.out.println(out);
			
			break;
			
		case 3 :
			System.out.println("Stack LIFO(Last In First Out");
			
			Stack<Person> st2 = new Stack<Person>(p);
			in = "";
			System.out.println("IN ORDER id's");
			for(int i = 0;i<p.length;) {
				tmp = p[i];
				in += tmp.getId()+" | ";
				i++;
				
			}
			
			System.out.println(in);
			out = "";
			while(st2.isEmpty()!=true) {

				tmp = st2.pop();
				out += tmp.getId()+" | ";//+tmp.getName()+" ";
				
			
			}
			System.out.println("OUT ORDER id's");
			System.out.println(out);
			
			break;
			
			default :
				
				System.out.println("Wrong choice");
				
				break;
		
		}
		
		sc.close();
		
	}
	
	
}

