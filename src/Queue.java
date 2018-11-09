
public class Queue<T>{
	
	private Node<T> head;
	private int count;
	
	public Queue() {
		
		this.head = null;
		this.count = 0;
		
	}
	
	public Queue (T[] arr) {
		//!
		Queue<T> q = new Queue<T>();
		for(int i=0;i<arr.length;i++) {
			
			q.enqeue(arr[i]);
			
		}
		this.head = q.head;
		this.count = q.count;
		
	}
	
	public void enqeue(T data) {
		
		if(count==0) {
			this.head = new Node<T>(data);
			count=1;
		}else {
			
			Node<T> tmp = new Node<T>();
			tmp = head;
			head = new Node<T>(data);
			head.setNext(tmp);
			count++;
			
		}
		
	}
	
	public T deqeue() {
		
		Node<T> tmp = head;
		if(count==1) {
			
			T p = head.getData();
			head = null;
			count--;
			return p;
		}
		else if(count==2) {
			T p = head.getNext().getData();
			head.setNext(null);
			count--;
			return p;
		}else {
			
		while(tmp.getNext().getNext()!=null) {
			
			tmp = tmp.getNext();
			
		}
		T p = tmp.getNext().getData();
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
	
	/*public T[] toArray() {
		T[] arr = new T[count];
		Node<T> tmp = head;
		for(int i=0;i<count;i++) {
			
			arr[i] = tmp.getData();
			tmp = tmp.getNext();
			
		}
		
		return arr;
	}*/

}
