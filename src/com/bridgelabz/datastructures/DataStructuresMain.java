package com.bridgelabz.datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		Node<Integer> first = new Node(56);
		Node<Integer> second = new Node(30);
		Node<Integer> third = new Node(70);
		
		first.setNext(second);
		second.setNext(third);
		
		boolean result = first.getNext().equals(second) && second.getNext().equals(third);
		System.out.println(result);
	}
}
