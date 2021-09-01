package com.bridgelabz.datastructures;

public interface NodeIF<T> {
	T getData();
	void setData(T data);
	
	NodeIF<T> getNext();
	void setNext(NodeIF<T> next);
}
