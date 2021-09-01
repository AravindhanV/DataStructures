package com.bridgelabz.datastructures;

public class Node<T> implements NodeIF<T>{
	private T key;
	private NodeIF<T> next;
	
	public Node(T data) {
		this.key = data;
		this.next = null;
	}
	
	public T getKey() {
		return this.key;
	}
	
	public void setKey(T data) {
		this.key = data;
	}
	
	public void setNext(NodeIF<T> next) {
		this.next = next;
	}
	
	public NodeIF getNext() {
		return this.next;
	}
}
