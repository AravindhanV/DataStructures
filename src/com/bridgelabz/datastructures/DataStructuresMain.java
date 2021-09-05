package com.bridgelabz.datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		SortedLinkedList linkedList = new SortedLinkedList<>();
		linkedList.add(new Node(47));
		linkedList.add(new Node(37));
		linkedList.add(new Node(24));
		linkedList.add(new Node(26));
		
		linkedList.printList();
	}
}
