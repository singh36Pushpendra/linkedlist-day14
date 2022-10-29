package ds.linear.dynamic;

public class SortedLinkedList<T extends Comparable<T>> {

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

	public void add(T item) {

		// Add elements in ascending order.
		
		if (head == null) {
			Node newNode = new Node(item);
			head = newNode;
		}
		else {
			Node temp = head;
			int count = 0;
			while (temp != null) {
				if (item.compareTo(temp.item) > 0)
					count++;
				temp = temp.ref;
			}
			insert(count, item);
		}
	}

	public int size() {
		int count = 0;

		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.ref;
		}

		return count;
	}

	public void remove(T item) {
		// Assuming item already present in list.

		Node left = head;
		if (left.ref == null) {
			head = null;
		} else if (left.ref.ref == null) {
			if (left.item.equals(item))
				head = head.ref;
			else
				head.ref = null;
		} else {
			if (left.item.equals(item))
				head = head.ref;
			else {
				Node right = left.ref;
				while (left.ref != null) {
					if (left.ref.item.equals(item)) {
						left.ref = right.ref;
						return;
					}
					left = left.ref;
					right = right.ref;
				}
			}
		}
	}

	public void append(T item) {
		addLast(item);
	}

	public void insert(int pos, T item) {
		
		if (pos == 0) {
			addFirst(item);
			return;
		}
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

	public int index(T item) {
		// Assuming the item is in the list.

		Node temp = head;
		int count = 0;
		while (temp != null) {
			if (temp.item.equals(item)) {
				break;
			}
			count++;
			temp = temp.ref;
		}
		return count;
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
