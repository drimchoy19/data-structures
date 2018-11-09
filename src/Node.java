
public class Node <T> {
	
	private T data;
	private Node<T> next;
	
	public Node() {
		
		this.data = null;
		this.next = null;
		
	}
	
	public Node(T data) {
		
		this.data = data;
		this.next = null;
		
	}
	
	public void setNext(Node<T> next) {
		
		this.next = next;
		
	}
	
	public Node<T> getNext() {
		
		return this.next;
		
	}
	
	public T getData() {
		
		return this.data;
		
	}
	
	public void setData(T data) {
		
		this.data = data;
		
	}
	
}
