
public class LinkedList {

	private int count;
	private Node head;

	//getFirst,getLast,removeFirst,removeByIndex
	public LinkedList() {

		this.count = 0;
		this.head = null;

	}

	public void add(Person data) {

		if (count == 0) {

			head = new Node(data);
			count = 1;

		} else {

			Node tmp = head;
			while (tmp.getNext() != null) {

				tmp = tmp.getNext();

			}
			tmp.setNext(new Node(data));
			count++;
		}

	}

	public Person get(int index) {

		if (index > count) {

			return null;

		} else if (index == 1) {

			return head.getData();

		} else {
			Node tmp = head;
			for (int i = 1; i < index; i++) {

				tmp = tmp.getNext();

			}
			return tmp.getData();
		}

	}
	
	public Person removeLast() {
		
		Node tmp = head;
		if(count==1) {
			head = null;
			return tmp.getData();
		}else {
		while(tmp.getNext().getNext()!=null) {
			
			tmp = tmp.getNext();
			
		}
		Node curr = tmp.getNext();
		tmp.setNext(null);;
		count--;
		return curr.getData();
	}
	}
	
	public int size() {

		return this.count;

	}
	
	public boolean isEmpty() {
		
		return head == null ? true :  false;
	}
}
