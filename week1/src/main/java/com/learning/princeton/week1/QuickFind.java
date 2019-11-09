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
		int aval = internal[a];		
		for(int i=0; i<internal.length; i++) {
			if(internal[i] == aval) {
				internal[i] = internal[b];
			}
		}

	}

	public boolean find(int a, int b) {
		return internal[a] == internal[b];
	}

}
