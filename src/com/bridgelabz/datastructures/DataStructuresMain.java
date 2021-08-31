package com.bridgelabz.datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		SortedLinkedList<Integer> linkedList  = new SortedLinkedList();
		linkedList.add(new Node(56));
		linkedList.add(new Node(30));
		linkedList.add(new Node(40));
		linkedList.add(new Node(70));
		

		linkedList.printList();

	}
}
