package com.bridgelabz.binary;

/**
 * Purpose : Implement Binary Search Tree
 * @author Ganesh Gavhad
 *@version 1.0
 * @param <K>
 */
public class MyBinaryTree<K extends Comparable<K>>{
	
	private MyBinaryNode<K> root;
	
	/**
	 * adding key to the tree
	 */
	public void add (K key) {
		this.root = this.addRecursively(root,key);
	}
	private MyBinaryNode<K>addRecursively(MyBinaryNode<K> current, K key){
		
		if(current==null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult==0)
			return current;
		if(compareResult<0) {
			current.left =addRecursively(current.left, key);
		}
		else {
			current.right =addRecursively(current.right, key);
		}
		return current;
		
	}
	/**
	 * Size of tree
	 */
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	public int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 +this.getSizeRecursive(current.left)+this.getSizeRecursive(current.right);
		
	}
}
