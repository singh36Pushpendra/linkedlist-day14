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
		
		System.out.print("LinkedList sequence: ");
		integers2.display();
		
	}

}
