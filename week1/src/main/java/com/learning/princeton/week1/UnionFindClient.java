/**
 * 
 */
package com.learning.princeton.week1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Client for UnionFind algorithms
 * @author aditya
 *
 */
public class UnionFindClient {

	private static final String PATH = "src/main/resources/file/UnionFindData1";
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File(PATH));
			int size = Integer.parseInt(in.nextLine());
			System.out.println("size is: "+size);
			UnionFind uf = new QuickFind(size);
			
			while(in.hasNext()) {
				String pointPair = in.nextLine();
				int a = Integer.parseInt(pointPair.split(" ")[0]);
				int b = Integer.parseInt(pointPair.split(" ")[1]);
				uf.connected(a, b);
			}
			in.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
