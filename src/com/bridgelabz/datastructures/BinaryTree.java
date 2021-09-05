package com.bridgelabz.datastructures;

public class BinaryTree <K extends Comparable<K>>{
private BinaryNode<K> root;
	
	public void add(K key) {
		this.root=this.addRecursively(root,key);
	}
	
	public BinaryNode<K> addRecursively(BinaryNode<K> current,K key){
		if(current==null)
			return new BinaryNode<>(key);
		int compareResult=key.compareTo(current.key);
		if(compareResult==0) return current;
		if(compareResult<0) {
			current.left=addRecursively(current.left, key);
		}
		else {
			current.right=addRecursively(current.right, key);
		}
		return current;
	}
	
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	private int getSizeRecursive(BinaryNode<K> current) {
		return current==null?0:1+this.getSizeRecursive(current.left)+ this.getSizeRecursive(current.right);
	}
	
	public boolean search(K find) {
		if(searchRecursive(root,find))
			return true;
		else
			return false;
		
	}
	private boolean searchRecursive(BinaryNode<K> current, K find) {
		if(current==null)
			return false;
		int compare=current.key.compareTo(find);
		if(compare==0)
			return true;
		else if(compare<0)
			return searchRecursive(current.right, find);
		else
			return searchRecursive(current.left, find);
	}
}
