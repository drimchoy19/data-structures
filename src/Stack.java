
public class Stack {
	
	Node head;
	private int count;
	
	public Stack() {
		
		this.head = null;
		this.count = 0;
		
	}
	
	public void push(Person data) {
		
		if(head==null) {
			
			this.head = new Node(data);
			count = 1;
			
		}else {
			
			Node tmp = new Node(data);
			tmp.setNext(head);
			head = tmp;
			count++;
			
			
		}
		
	}
	
	public Person pop() {
		
		Person tmp = null;
		if(count==1) {
			tmp = head.getData();
			head = null;
			count--;
			return tmp;
		}else {
			tmp = head.getData();
			head = head.getNext();
			count--;
			return tmp;
		}
		
	}
	public Person peek() {
		
		return head.getData();
		
	}
	
	public int size() {
		
		return this.count;
		
	}
	
	public boolean isEmpty() {
		
		return head == null ? true : false;
		
	}
	
	public Person[] toArray() {
		
		Person[] arr = new Person[this.count];
		Node tmp = head;
		for(int i=0;i<count;i++) {
			
			arr[i] = tmp.getData();
			tmp = tmp.getNext();
			
		}
		return arr;
	}

}
