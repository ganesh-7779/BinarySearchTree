package com.bridgelabz.binary;

/*****************************************
 *Purpose : Implement Binary Search Tree
 *@author Ganesh Gavhad
 *@version 1.0
 *****************************************/

public class MyBinaryTree<K extends Comparable<K>>{
	
	private MyBinaryNode<K> root;
	
	/**
	 * adding key to the tree
	 */
	public void add (K key) {
		this.root = this.addRecursively(root,key);
	}
	/**
	 * @param current is a root key for left and right side key 
	 * @param key is value / data of tree node
	 * @return Adding key to the node of tree
	 */
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
	 * This method is use to search node in BST
	 * @param key value of node
	 * @return node
	 */
	public MyBinaryNode<K> search(K key) {
		
		return searchRecursive(root, key);
	}

	/**
	 * Recursive method for searching purpose in BST
	 * @param current is a root key for left and right side key 
	 * @param key is value / data of tree node
	 * @return key that we are searching
	 */
	private MyBinaryNode<K> searchRecursive(MyBinaryNode<K> current, K key) {
		if (current == null)    
		return null;
		else if(current.key.compareTo(key) == 0)     
			return current;
		else if(current.key.compareTo(key) < 0)      
			return searchRecursive(current.right, key);
		else
			return searchRecursive(current.left, key);  
	}
	/**
	 * It displays the node
	 */
	public void printNodes() {
		printNodes(root);

	}

	/**
	 * @param root is staring node of tree
	 */
	private void printNodes(MyBinaryNode<K> root) {
		if (root != null) {
		printNodes(root.left);
		System.out.println(root.key);
		printNodes(root.right);

		}
	}
	/**
	 * Size of tree
	 * return Size of BST
	 */
	
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	public int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 +this.getSizeRecursive(current.left)+this.getSizeRecursive(current.right);
		
	}
	
}
