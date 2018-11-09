
public class LinkedList<T> {

	private int count;
	private Node<T> head;

	//removeByIndex,toArray
	public LinkedList() {

		this.count = 0;
		this.head = null;

	}
	
	public LinkedList(T[] arr) {
		LinkedList<T> ll = new LinkedList<T>();
		
		for(int i=0;i<arr.length;i++) {
			
			ll.add(arr[i]);
			
		}
		this.head = ll.head;
		this.count = ll.count;
	}

	public void add(T data) {

		if (count == 0) {

			head = new Node<T>(data);
			count = 1;

		} else {

			Node <T> tmp = head;
			while (tmp.getNext() != null) {

				tmp = tmp.getNext();

			}
			tmp.setNext(new Node<T>(data));
			count++;
		}

	}

	public T get(int index) {

		if (index > count) {

			return null;

		} else if (index == 1) {

			return head.getData();

		} else {
			Node<T> tmp = head;
			for (int i = 1; i < index; i++) {

				tmp = tmp.getNext();

			}
			return tmp.getData();
		}

	}
	
	public T removeLast() {
		
		Node<T> tmp = head;
		if(count==1) {
			head = null;
			return tmp.getData();
		}else {
		while(tmp.getNext().getNext()!=null) {
			
			tmp = tmp.getNext();
			
		}
		Node<T> curr = tmp.getNext();
		tmp.setNext(null);;
		count--;
		return curr.getData();
	}
	}
	
	public T getFirst() {
		
		return head.getData();
		
	}
	
	public T getLast() {
		
		Node<T> tmp = head;
		while(tmp.getNext()!=null) {
			
			tmp = tmp.getNext();
			
		}
		return tmp.getData();
	}
	
	public T removeFirst() {
		
		T tmp = head.getData();
		head = head.getNext();
		count--;
		return tmp;
		
	}
	
	public int size() {

		return this.count;

	}
	
	public boolean isEmpty() {
		
		return head == null ? true :  false;
	}
}
