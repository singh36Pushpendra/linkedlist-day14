package ds.linear.dynamic.test;

import org.junit.Test;

import ds.linear.dynamic.SortedLinkedList;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SortedLinkedListTest {

	
	@Test
	public void searchTest() {
		SortedLinkedList<Integer> nums;
		nums = new SortedLinkedList<Integer>();
		nums.append(56);
		nums.append(30);
		nums.append(70);
		
		Assert.assertEquals(true, nums.search(30));
	}
	
	@Test
	public void indexTest() {
		SortedLinkedList<Integer> nums;
		nums = new SortedLinkedList<Integer>();
		nums.append(56);
		nums.append(30);
		nums.append(70);
		
		Assert.assertEquals(1, nums.index(30));
	}
	
	@Test
	public void sizeTest() {
		SortedLinkedList<Integer> nums;
		nums = new SortedLinkedList<Integer>();
		nums.append(56);
		nums.append(30);
		nums.append(40);
		nums.append(70);
		nums.remove(40);
		
		Assert.assertEquals(3, nums.size());
	}
}
