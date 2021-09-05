package com.bridgelabz.datastructures;

public class Stack<T extends Comparable<T>> {
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
	
	public int pop() {
		if(list.size()==0) {
			return -1;
		}
		list.pop();
		return 0;
	}
	
	public boolean isEmpty() {
		return list.size()==0;
	}
}
