
public class LinkedList<T> {

	private int count;
	private Node<T> head;

	//toArray
	public LinkedList() {

		this.count = 0;
		this.head = null;

	}

	public LinkedList(T[] arr) {
		LinkedList<T> ll = new LinkedList<T>();

		for (int i = 0; i < arr.length; i++) {

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

			Node<T> tmp = head;
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
	
	public void show() {
		
		Node<T> tmp = head;
		while(tmp!=null) {
			
			System.out.println(tmp.getData().toString());
			tmp = tmp.getNext();
			
		}
		
	}

	public T remove(int index) {

		Node<T> tmp = this.head;
		Node<T> next = null;
		Node<T> prev = null;

		/*for(int j=0;j<index;j++) {
			
			System.out.println(""+j+" "+tmp);
			tmp = tmp.getNext();
		}*/
		if (index > count) {

			return null;

		} else if (index == 1) {
			head = head.getNext();
			count--;
			return tmp.getData();

		} else if (index == count) {

			return this.removeLast();

		} else {

			for (int i = 0; i < index-1; i++) {
				if (i == index-2) {
					prev = tmp;
					tmp = tmp.getNext();
					next = tmp.getNext();
					
				}  else
					tmp = tmp.getNext();

			}
			//System.out.println("tmp " + tmp);

			//System.out.println("prev "+prev);
			//System.out.println("next " + next);
			prev.setNext(next);
			count--;
		}

		return tmp.getData();

	}

	public T getFirst() {

		return head.getData();

	}

	public T getLast() {

		Node<T> tmp = head;
		while (tmp.getNext() != null) {

			tmp = tmp.getNext();

		}
		return tmp.getData();
	}

	public T removeLast() {

		Node<T> tmp = head;
		if (count == 1) {
			head = null;
			return tmp.getData();
		} else {
			while (tmp.getNext().getNext() != null) {

				tmp = tmp.getNext();

			}
			Node<T> curr = tmp.getNext();
			tmp.setNext(null);
			;
			count--;
			return curr.getData();
		}
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

		return head == null ? true : false;
	}
}
