
public class Node {
	
	private Person data;
	private Node next;
	
	public Node() {
		
		this.data = null;
		this.next = null;
		
	}
	
	public Node(Person data) {
		
		this.data = data;
		this.next = null;
		
	}
	
	public void setNext(Node next) {
		
		this.next = next;
		
	}
	
	public Node getNext() {
		
		return this.next;
		
	}
	
	public Person getData() {
		
		return this.data;
		
	}
	
	public void setData(Person data) {
		
		this.data = data;
		
	}
	
}
