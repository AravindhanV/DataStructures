package com.bridgelabz.datastructures;

public class Node<T> {
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
}
