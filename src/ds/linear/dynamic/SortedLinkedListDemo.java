package ds.linear.dynamic;

public class SortedLinkedListDemo {

	public static void main(String[] args) {
		SortedLinkedList<Integer> integers = new SortedLinkedList<Integer>();
		integers.addLast(56);
		integers.addLast(30);
		integers.addLast(70);
		
		SortedLinkedList<Integer> integers2 = new SortedLinkedList<Integer>();
		integers2.addFirst(70);
		integers2.addFirst(30);
		integers2.addFirst(56);
		
		System.out.print("SortedLinkedList sequence after adding at first: ");
		integers2.display();
		
		SortedLinkedList<Integer> integers3 = new SortedLinkedList<Integer>();
		integers3.append(56);
		integers3.append(30);
		integers3.append(70);

		System.out.print("SortedLinkedList sequence after appending: ");
		integers2.display();
		
		SortedLinkedList<Integer> integers4 = new SortedLinkedList<Integer>();
		integers4.append(56);
		integers4.append(70);
		integers4.insert(1, 30);
		
		System.out.print("SortedLinkedList sequence after inserting: ");
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
		SortedLinkedList<Integer> nums = new SortedLinkedList<>();
		nums.append(56);
		nums.append(30);
		nums.append(70);
		int indexOf30 = nums.index(30);
		nums.insert(indexOf30 + 1, 40);
		nums.display();
		
		nums.remove(40);
		System.out.println("Size of list after deleting 40: " + nums.size());
		
		SortedLinkedList<Integer> numbers = new SortedLinkedList<Integer>();
		numbers.add(56);
		numbers.add(30);
		numbers.add(40);
		numbers.add(70);
		System.out.println("\nSorted Linked List:");
		numbers.display();
		
	}

}
	