package com.bridgelabz.datastructures;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>>,NodeIF<T> {
	private T data;
	private NodeIF<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	public T getKey() {
		return this.data;
	}
	
	public void setKey(T data) {
		this.data = data;
	}
	
	public void setNext(NodeIF<T> next) {
		this.next = next;
	}
	
	public NodeIF<T> getNext() {
		return this.next;
	}

	@Override
	public int compareTo(Node<T> node) {
		return getKey().compareTo(node.getKey());
	}

}
