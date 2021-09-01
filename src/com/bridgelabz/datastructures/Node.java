package com.bridgelabz.datastructures;

public class Node<T> implements NodeIF<T>{
	private T data;
	private NodeIF<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public void setNext(NodeIF<T> next) {
		this.next = next;
	}
	
	public NodeIF getNext() {
		return this.next;
	}
}
