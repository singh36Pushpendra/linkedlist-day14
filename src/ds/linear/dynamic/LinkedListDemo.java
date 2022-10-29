package ds.linear.dynamic;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> integers = new LinkedList<Integer>();
		integers.addLast(56);
		integers.addLast(30);
		integers.addLast(70);
		
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
		
		integers4.pop();
		System.out.println("\nAfter deleting first element: ");
		System.out.print("Linked List: ");
		integers4.display();
		
		System.out.println("\nIntegers before deleting: ");
		integers.display();
		
		integers.popLast();
		System.out.println("\nAfter deleting last element: ");
		System.out.print("Linked List: ");
		integers.display();
		
		if (integers2.search(30))
			System.out.println("Element found!");
		else
			System.out.println("Element not found!");
		
		// Inserting 40 after 30.
		LinkedList<Integer> nums = new LinkedList<>();
		nums.append(56);
		nums.append(30);
		nums.append(70);
		int indexOf30 = nums.index(30);
		nums.insert(indexOf30 + 1, 40);
		nums.display();
	}

}
