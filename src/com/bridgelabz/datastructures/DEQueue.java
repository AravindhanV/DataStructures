package com.bridgelabz.datastructures;

public class DEQueue<T extends Comparable<T>> extends Queue<T> {
	public DEQueue() {
		super();
	}
	
	public void enQueueReverse(T data) {
		this.list.add(new Node(data));
	}
	
	public T deQueueReverse() {
		return this.list.popLast();
	}
}
