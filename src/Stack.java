
public class Stack<T> {
	
	private Node<T> head;
	private int count;
	
	public Stack() {
		
		this.head = null;
		this.count = 0;
		
	}
	
	public Stack (T[] arr) {
		//!
		Stack<T> s = new Stack<T>();
		for(int i=0;i<arr.length;i++) {
			
			s.push(arr[i]);
			
		}
		this.head = s.head;
		this.count = s.count;
		
	}
	
	public void push(T data) {
		
		if(head==null) {
			
			this.head = new Node<T>(data);
			count = 1;
			
		}else {
			
			Node<T> tmp = new Node<T>(data);
			tmp.setNext(head);
			head = tmp;
			count++;
			
			
		}
		
	}
	
	public T pop() {
		
		T tmp = null;
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
	public T peek() {
		
		return head.getData();
		
	}
	
	public int size() {
		
		return this.count;
		
	}
	
	public boolean isEmpty() {
		
		return head == null ? true : false;
		
	}
	
	/*public T toArray() {
		
		
		Node<T> tmp = head;
		for(int i=0;i<count;i++) {
			
			arr[i] = tmp.getData();
			tmp = tmp.getNext();
			
		}
		return arr;
	}*/

}
