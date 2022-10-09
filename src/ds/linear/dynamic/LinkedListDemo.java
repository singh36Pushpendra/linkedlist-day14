package ds.linear.dynamic;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> integers = new LinkedList<Integer>();
		integers.addLast(56);
		integers.addLast(30);
		integers.addLast(70);
		integers.display();
		
		LinkedList<Integer> integers2 = new LinkedList<Integer>();
		integers2.addFirst(70);
		integers2.addFirst(30);
		integers2.addFirst(56);
		
		System.out.print("LinkedList sequence after adding at first: ");
		integers2.display();
		
		LinkedList<Integer> integers3 = new LinkedList<Integer>();
		integers3.append(56);
		integers3.append(30);
		integers3.append(70);

		System.out.print("LinkedList sequence after appending: ");
		integers2.display();
		
		LinkedList<Integer> integers4 = new LinkedList<Integer>();
		integers4.append(56);
		integers4.append(70);
		integers4.insert(1, 30);
		
		System.out.print("LinkedList sequence after inserting: ");
		integers4.display();
	}

}
