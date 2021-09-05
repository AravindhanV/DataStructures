package com.bridgelabz.datastructures;

public class SortedLinkedList<T extends Comparable<T>> {
	NodeIF<T> head;
	NodeIF<T> tail;

	public SortedLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(NodeIF<T> node) {
		if (head == null) {
			head = node;
			tail = node;
		} else if (head == tail) {
			if (((Node<T>)head).compareTo((Node<T>)node) > 0) {
				node.setNext(head);
				head = node;
			} else {
				head.setNext(node);
				tail = node;
			}
		} else {
			NodeIF<T> temp = head;
			if(((Node<T>)temp).compareTo((Node<T>)node) > 0) {
				node.setNext(head);
				head = node;
				return;
			}
			while (temp.getNext() != null && ((Node<T>)temp.getNext()).compareTo((Node<T>)node) < 0) {
				temp = temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
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

	public void printList() {
		NodeIF<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getKey().toString() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void pop() {
		if (head == null) {
			return;
		}
		head = head.getNext();
		if (head == null) {
			tail = null;
		}
	}

	public void popLast() {
		if (head == null) {
		} else if (head == tail) {
			head = tail = null;
		} else {
			NodeIF<T> temp = head;
			while (temp.getNext() != tail) {
				temp = temp.getNext();
			}
			tail = temp;
			temp.setNext(null);
		}
	}

	public void deleteNode(T key) {
		NodeIF<T> keyNode = search(key);
		if (keyNode == null) {
			return;
		}
		if (head == keyNode) {
			head = null;
			tail = null;
		} else {
			NodeIF<T> temp = head;
			while (temp.getNext() != keyNode) {
				temp = temp.getNext();
			}
			temp.setNext(keyNode.getNext());
			if (keyNode == tail) {
				tail = temp;
			}
		}
	}

	public int size() {
		int length = 0;
		NodeIF temp = head;
		while (temp != null) {
			temp = temp.getNext();
			length++;
		}
		return length;
	}
}
