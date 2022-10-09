package ds.linear.dynamic;

public class LinkedList<T> {

	Node head;
	
	class Node {
		T item;
		Node ref;
		
		Node(T item) {
			this.item = item;
		}
		
	}
	
	public void addLast(T item) {
		Node newNode = new Node(item);
		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			while (temp.ref != null)
				temp = temp.ref;
			temp.ref = newNode;
		}
	}
	
	public void addFirst(T item) {
		Node newNode = new Node(item);
		if (head == null)
			head = newNode;
		else {
			newNode.ref = head;
			head = newNode;
		}
	}
	
	public void display() {
		Node temp = head;
		while (temp != null) {
			if (temp.ref != null)
				System.out.print(temp.item + " -> ");
			else
				System.out.println(temp.item);
			temp = temp.ref;
		}
	}
}
