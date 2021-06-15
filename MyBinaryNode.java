package com.bridgelabz.binary;

/*************************************************
 * Purpose: Implementation of Binary search tree
 * @author Ganesh Gavhad
 * @varsion 1.0
 *************************************************/
public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;

/**
 *Constructor for node variable
 */
public 	MyBinaryNode(K key) {
	this.key=key;
	this.left=null;
	this.right=null;
}

public K getKey() {
	return key;
}

}
