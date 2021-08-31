package com.bridgelabz.datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList  = new LinkedList();
		linkedList.append(new Node(56));
		linkedList.append(new Node(70));
		
		linkedList.add(new Node(30),56);
		
		linkedList.printList();
	}
}
