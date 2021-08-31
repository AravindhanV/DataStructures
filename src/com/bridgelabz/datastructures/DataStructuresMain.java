package com.bridgelabz.datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList  = new LinkedList();
		linkedList.append(new Node(56));
		linkedList.append(new Node(30));
		linkedList.append(new Node(40));
		linkedList.append(new Node(70));
		
		System.out.println(linkedList.size());
		linkedList.deleteNode(40);
		System.out.println(linkedList.size());
	}
}
