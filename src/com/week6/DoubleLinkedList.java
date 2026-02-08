package com.week6;

public class DoubleLinkedList {

	class Node {
		int data;
		Node prev;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	Node head = null;
	
	public void insertBeginning(int data) {
		Node newNode = new Node(data);
		if(head != null) {
		head.prev = newNode;
		newNode.next = head;
		}
		head = newNode;
	}
	public void insertEnd(int data) {
	    Node newNode = new Node(data);
	    if (head == null) {   
	        head = newNode;
	        return;
	    }
	    Node temp = head;
	    while (temp.next != null) {
	        temp = temp.next;
	    }
	    temp.next = newNode;
	    newNode.prev = temp;
	}

	public void insertPos(int data,int pos) {
	    if(pos == 1) {
	        insertBeginning(data);
	        return;
	    }
	    Node newNode = new Node(data);
	    Node temp = head;
	    for(int i = 1; i < pos - 1 && temp != null; i++) {
	        temp = temp.next;
	    }
	    if (temp == null || temp.next == null) return;
	    newNode.next = temp.next;        
	    newNode.prev = temp;
	    temp.next.prev = newNode;        
	    temp.next = newNode;
	}

	public void deleteBegin() {
		if(head == null || head.next == null) {
			head = null;
			return;
		}
		head = head.next;
		head.prev = null;
	}
	public void deleteEnd() {
		if(head == null || head.next == null) {
			head=null;
			return;
		}
		Node temp=head; 
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node temp1=temp.next;
		temp.next = null;
		temp1.prev = null;
	}
	public void deleteValue(int key) {
		if(head == null) return;
		if(head.data == key) {
			head = head.next;
			head.prev = null;
			return;
		}
		Node temp = head;
		while(temp.next!=null && temp.next.data != key) {
			temp=temp.next;
		}
		temp.next = null;
	}
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" <=> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		
		list.insertBeginning(10);
		list.insertEnd(20);
		list.insertEnd(50);
		list.insertBeginning(30);
		list.insertPos(40, 2);
		list.display();
		list.deleteBegin();
		list.display();
		list.deleteEnd();
		list.display();
		list.deleteValue(40);
		list.display();
	}
}