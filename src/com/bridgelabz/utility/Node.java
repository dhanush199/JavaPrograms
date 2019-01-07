package com.bridgelabz.utility;

public class Node <T>{

	private T value;
	private Node<T> nextRef;
	public Node(){
		value=null;
		nextRef=null;
	}

	public Node(T data, Node<T> next){
		this.value=data;
		this.nextRef=next;
	}

	public T getValue() {

		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> ref) {
		this.nextRef = ref;
	}
}



