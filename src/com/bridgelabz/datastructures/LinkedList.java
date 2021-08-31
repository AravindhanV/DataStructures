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
		} else {
			node.setNext(head);
			head = node;
		}
	}
	
	public void append(Node<T> node) {
		if(head==null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}
	
	public void printList() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.getData().toString()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
}
