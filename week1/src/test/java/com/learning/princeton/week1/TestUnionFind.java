package com.learning.princeton.week1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestUnionFind {
	
	@Test
	public void findTest() {
		UnionFind uf = new QuickFind(10);
		uf.connected(1, 2);
		uf.connected(2, 3);
		uf.connected(4, 5);
		uf.connected(5, 6);
		
		boolean status = uf.find(1, 3);
		assertEquals(status, true);
		
		status = uf.find(5, 4);
		assertEquals(status, true);
		
		status = uf.find(3, 4);
		assertEquals(status, false);
	}
}
