package com.xingze.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class JunitTest02Test {
	int[] arr1= {};
	int[] arr2= {1,-2,3,10,-4,7,2,-5};
	int[] arr3= {-2,3};
	int[] arr4= {-1,-2,-6};
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetMaxAddOfArray1() {
	    int sz1=0;
		int result=JunitTest02.GetMaxAddOfArray(arr1,sz1);
		assertEquals(0, result);
	}
	
	@Test
	public void testGetMaxAddOfArray2() {
	    int sz2=8;
		int result=JunitTest02.GetMaxAddOfArray(arr2,sz2);
		assertEquals(18, result);
	}
	
	@Test
	public void testGetMaxAddOfArray3() {
	    int sz3=2;
		int result=JunitTest02.GetMaxAddOfArray(arr3,sz3);
		assertEquals(3, result);
	}
	
	@Test
	public void testGetMaxAddOfArray4() {
	    int sz4=3;
		int result=JunitTest02.GetMaxAddOfArray(arr4,sz4);
		assertEquals(0, result);
	}

}
