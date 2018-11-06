
public class Queue{
	
	Node head;
	private int count;
	
	public Queue() {
		
		this.head = null;
		this.count = 0;
		
	}
	
	public Queue (Person[] arr) {
		//!
		Queue q = new Queue();
		for(int i=0;i<arr.length;i++) {
			
			q.enqeue(arr[i]);
			
		}
		this.head = q.head;
		this.count = q.count;
		
	}
	
	public void enqeue(Person data) {
		
		if(count==0) {
			this.head = new Node(data);
			count=1;
		}else {
			
			Node tmp = new Node();
			tmp = head;
			head = new Node(data);
			head.setNext(tmp);
			count++;
			
		}
		
	}
	
	public Person deqeue() {
		
		Node tmp = head;
		if(count==1) {
			
			Person p = head.getData();
			head = null;
			count--;
			return p;
		}
		else if(count==2) {
			Person p = head.getNext().getData();
			head.setNext(null);
			count--;
			return p;
		}else {
			
		while(tmp.getNext().getNext()!=null) {
			
			tmp = tmp.getNext();
			
		}
		Person p = tmp.getNext().getData();
		tmp.setNext(null);
		count--;

		return p;
		}
	}
	
	public int size() {
		return this.count;
	}
	
	public boolean isEmpty() {
		
		return head==null ? true : false;
		
	}
	
	public Person[] toArray() {
		Person[] arr = new Person[count];
		Node tmp = head;
		for(int i=0;i<count;i++) {
			
			arr[i] = tmp.getData();
			tmp = tmp.getNext();
			
		}
		
		return arr;
	}
	 

}
