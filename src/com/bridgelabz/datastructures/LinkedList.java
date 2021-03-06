package com.bridgelabz.datastructures;

public class LinkedList<T> {
	NodeIF<T> head;
	NodeIF<T> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(NodeIF<T> node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head = node;
		}
	}

	public void add(NodeIF<T> node, T key) {
		NodeIF keyNode = search(key);
		if (keyNode == null) {
			return;
		}
		if (tail.equals(keyNode)) {
			tail = node;
		}
		node.setNext(keyNode.getNext());
		keyNode.setNext(node);
	}
	
	public NodeIF<T> getHead() {
		return head;
	}

	public NodeIF<T> search(T key) {
		NodeIF<T> temp = head;
		while (temp != null && !temp.getKey().equals(key)) {
			temp = temp.getNext();
		}
		if (temp == null) {
			System.err.println("Cannot find " + key);
		}
		return temp;
	}

	public void append(NodeIF<T> node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	public void printList() {
		NodeIF<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getKey().toString() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public T pop() {
		if (head == null) {
			return null;
		}
		NodeIF<T> temp = head;
		head = head.getNext();
		if (head == null) {
			tail = null;
		}
		return temp.getKey();
	}

	public T popLast() {
		if (head == null) {
			return null;
		} else if (head == tail) {
			NodeIF<T> temp = head;
			head = tail = null;
			return temp.getKey();
		} else {
			NodeIF<T> temp = head;
			while (temp.getNext() != tail) {
				temp = temp.getNext();
			}
			tail = temp;
			NodeIF<T> deletedNode = temp.getNext();
			temp.setNext(null);
			return deletedNode.getKey();
		}
	}
	
	public void deleteNode(T key) {
		NodeIF<T> keyNode = search(key);
		if(keyNode == null) {
			return;
		}
		if(head==keyNode) {
			head=null;
			tail=null;
		} else {
			NodeIF<T> temp = head;
			while(temp.getNext()!= keyNode) {
				temp = temp.getNext();
			}
			temp.setNext(keyNode.getNext());
			if(keyNode == tail) {
				tail = temp;
			}
		}
	}

	public int size() {
		int length = 0;
		NodeIF<T> temp = head;
		while (temp != null) {
			temp = temp.getNext();
			length++;
		}
		return length;
	}
}
