import java.util.Scanner;

public class Testing {

	public static void main(String [] args) {
		

		Person tmp = new Person();
		Person[] p = new Person[7];
		p[0] = new Person("Gosho",22);
		p[1] = new Person("Ivan",23);
		p[2] = new Person("Gosho1",24);
		p[3] = new Person("Ivan1",43);
		p[4] = new Person("Petkan",33);
		p[5] = new Person("Shestkan",26);
		p[6] = new Person("Sedemkan",27);
		
		System.out.println("| 1 - LinkedList | 2 - Queue | 3 - Stack |");
		int a = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		String in = "";
		String out = "";
		switch (a) {
		
		case 1 :
			
			System.out.println("LinkedList");
			
			LinkedList ll = new LinkedList();
			
			for(int i=0;i<p.length;i++) {
				
				ll.add(p[i]);
				in += p[i].getId()+"-"+p[i].getName()+" ";
			}
			
			System.out.println(ll.size());
			System.out.println("IN");
			System.out.println(in);
			System.out.println("RemoveFirst - "+ll.removeFirst().getName());
			while(ll.isEmpty()!=true) {
				//?
				tmp = ll.removeFirst();
				out += tmp.getId()+"-"+tmp.getName()+" ";
				
			}
			
			System.out.println(out);
			break;
			
		case 2 :
			
			System.out.println("Queue");
			System.out.println("IN ORDER");
			in = "";
			for(int i = 0;i<p.length;) {
				tmp = p[i];
				in += tmp.getId()+"-"+tmp.getName()+" ";
				i++;
				
			}
			System.out.println(in);
			Queue q = new Queue(p);
			
			System.out.println(q.size());
			System.out.println("OUT ORDER");
			 out = "";
			while(q.isEmpty()!=true) {
				
				tmp = q.deqeue();
				out += tmp.getId()+"-"+tmp.getName()+" ";
				
			}
			
			System.out.println(out);
			System.out.println(q.size());
			
			break;
			
		case 3 :
			System.out.println("Stack");
			
			Stack s = new Stack();
			Stack st2 = new Stack(p);
			in = "";
			for(int i = 0;i<p.length;) {
				tmp = p[i];
				in += tmp.getId()+"-"+tmp.getName()+" ";
				i++;
				
			}
			System.out.println(in);
			s.push(p[0]);
			s.push(p[1]);
			s.push(p[2]);
			System.out.println(st2.size());
			out = "";
			while(st2.isEmpty()!=true) {

				tmp = st2.pop();
				out += tmp.getId()+"-"+tmp.getName()+" ";
				
			}
			
			System.out.println(out);
			break;
			
			default :
				
				System.out.println("Wrong choice");
				break;
		
		}
		
		
	}
}
