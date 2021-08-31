package com.bridgelabz.datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList  = new LinkedList();
		linkedList.add(new Node(70));
		linkedList.add(new Node(30));
		linkedList.add(new Node(56));
		
		linkedList.printList();
	}
}
