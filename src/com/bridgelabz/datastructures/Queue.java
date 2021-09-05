package com.bridgelabz.datastructures;

public class Queue<T extends Comparable<T>> {
	LinkedList<T> list;

	public Queue() {
		this.list = new LinkedList();
	}
	
	public void enQueue(T data) {
		list.append(new Node<T>(data));
	}
	
	public T deQueue() {
		return list.pop();
	}
}
