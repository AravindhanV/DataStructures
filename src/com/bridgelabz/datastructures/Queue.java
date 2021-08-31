package com.bridgelabz.datastructures;

public class Queue<T> {
	LinkedList<T> list;

	public Queue() {
		this.list = new LinkedList();
	}
	
	public void enQueue(T data) {
		list.append(new Node<T>(data));
		list.printList();
	}
	
	public void deQueue() {
		list.pop();
		list.printList();
	}
}
