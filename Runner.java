package com.bridgelabz.binary;

/**
 * Runner for main method
 */
public class Runner {

	public static void main (String[]args) {
		MyBinaryTree<Integer> element = new MyBinaryTree<>();
		element.add(56);
		element.add(30);
		element.add(70);
		int size = element.getSize();
		System.out.println(size);

	}
}
