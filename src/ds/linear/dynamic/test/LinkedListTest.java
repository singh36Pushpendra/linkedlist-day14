package ds.linear.dynamic.test;

import org.junit.Test;

import ds.linear.dynamic.LinkedList;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LinkedListTest {

	
	@Test
	public void searchTest() {
		LinkedList<Integer> nums;
		nums = new LinkedList<Integer>();
		nums.append(56);
		nums.append(30);
		nums.append(70);
		
		Assert.assertEquals(true, nums.search(30));
	}
	
	@Test
	public void indexTest() {
		LinkedList<Integer> nums;
		nums = new LinkedList<Integer>();
		nums.append(56);
		nums.append(30);
		nums.append(70);
		
		Assert.assertEquals(1, nums.index(30));
	}
	
	@Test
	public void sizeTest() {
		LinkedList<Integer> nums;
		nums = new LinkedList<Integer>();
		nums.append(56);
		nums.append(30);
		nums.append(40);
		nums.append(70);
		nums.remove(40);
		
		Assert.assertEquals(3, nums.size());
	}
}
