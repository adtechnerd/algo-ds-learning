/**
 * 
 */
package com.learning.princeton.week1;

/**
 * @author adity
 *
 */
public class QuickFind implements UnionFind {

	private int[] internal;

	public QuickFind(int n) {
		super();
		internal = new int[n];
		for (int i = 0; i < n; i++) {
			internal[i] = i;
		}
	}

	public void connected(int a, int b) {
		// TODO Auto-generated method stub
		for(int i=0; i<internal.length; i++) {
			if(internal[i] == a) {
				internal[i] = b;
			}
		}

	}

	public boolean find(int a, int b) {
		// TODO Auto-generated method stub
		return internal[a] == internal[b];
	}

}
