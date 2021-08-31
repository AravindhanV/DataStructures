package com.bridgelabz.datastructures;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(Node<T> node) {		
		if(head == null) {
			head = node;
			tail = node;
		}
		
		node.setNext(head);
		head = node;
	}
}
