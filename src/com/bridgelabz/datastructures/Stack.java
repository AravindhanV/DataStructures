package com.bridgelabz.datastructures;

public class Stack<T> {
	LinkedList<T> list;
	
	public Stack() {
		this.list = new LinkedList();
	}
	
	public void push(T data) {
		list.add(new Node<T>(data));
	}
	
	public T peek() {
		return list.getHead().getKey();
	}
	
	public void pop() {
		list.pop();
	}
}
