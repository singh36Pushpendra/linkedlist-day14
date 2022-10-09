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

	public void append(T item) {
		addLast(item);
	}

	public void insert(int pos, T item) {
		Node left = head;
		Node right = left.ref;
		Node newNode = new Node(item);
		int index = 0;
		while (index < pos - 1) {
			index++;
			left = left.ref;
			right = right.ref;
		}
		newNode.ref = right;
		left.ref = newNode;
	}
	
	public void pop() {
		if (head == null)
			System.out.println("Can't delete item: Empty LinkedList!");
		else
			head = head.ref;
	}
	
	public void popLast() {
		if (head == null)
			System.out.println("Can't delete item: Empty LinkedList");
		else if (head.ref == null)
			head = null;
		else {
			Node temp = head;
			while (temp.ref.ref != null)
				temp = temp.ref;
			temp.ref = null;
		}
	}
	
	public boolean search(T item) {
		Node temp = head;
		while (temp != null) {
			if (temp.item == item)
				return true;
			temp = temp.ref;
		}
		return false;
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
