package com.bridgelabz.datastructures;

public class Node<T> {
	private T data;
	private Node next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
}
