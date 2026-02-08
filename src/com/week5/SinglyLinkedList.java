package com.week5;
public class SinglyLinkedList 
{
	//Node creation
	class Node 
	{
		int data;
		Node next;
		
		Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	
	//insert beginning
	public void insertBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	//insert at end
	public void insertEnd(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp=temp.next;
		}
		temp.next = newNode;
	}
	
	//insert at specific location
	public void insertSpecificPos(int data, int pos) {
		Node newNode = new Node(data);
		
		if(pos == 1) {
			insertBeginning(data);
			return;
		}
		Node temp = head;
		for(int i=0; i<pos-1;i++) {
			temp=temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	//delete beginning
	public void deleteBegin() {
		if(head == null) {
			return;
		}
		head = head.next;
	}
	
	//delete at end
	public void deleteEnd() {
		if(head == null || head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	
	public void deleteValue(int key) {
		if(head ==null) {
			return;
		}
		if(head.data == key) {
			head = head.next;
			return;
		}
		Node temp = head;
		while(temp.next != null && temp.next.data != key) {
			temp = temp.next;
		}
		
		if(temp.next != null) {
			temp.next = temp.next.next;
		}
	}
	//display
	public void display() {
		Node temp = head;
		while(temp.next!= null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertBeginning(12);
		list.insertBeginning(20);
		list.insertEnd(45);
		list.insertEnd(50);
		list.insertSpecificPos(48,3);
		list.display();
		list.deleteBegin();
		list.deleteEnd();
		list.deleteValue(20);
		list.display();
		list.deleteValue(48);
		list.display();
	}
}
