package ds.linear.dynamic.test;

import org.junit.Test;

import ds.linear.dynamic.LinkedList;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LinkedListTest {

	@Test
	public void searchTest() {
		LinkedList<Integer> nums = new LinkedList<Integer>();
		nums.append(56);
		nums.append(30);
		nums.append(70);
		Assert.assertEquals(true, nums.search(30));
	}
}
