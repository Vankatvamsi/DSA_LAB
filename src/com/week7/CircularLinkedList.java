package com.week7;

public class CircularLinkedList {
	
	class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	Node tail = null;
	public void insertBegin(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=tail=newNode;
			tail.next=head;
			return;
		}
		else {
			newNode.next=head;
			head=newNode;
			tail.next=head;
		}
	}
	public void insertEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=tail=newNode;
			tail.next=head;
			return;
		}
		else {
			tail.next=newNode;
			newNode.next=head;
			tail = newNode;
		}
	}
	public void insertPos(int data, int pos) {
	    if (pos == 1) {
	        insertBegin(data);
	        return;
	    }
	    Node newNode = new Node(data);
	    Node temp = head;
	    for (int i = 1; i < pos - 1 && temp.next != head; i++) {
	        temp = temp.next;
	    }
	    newNode.next = temp.next;
	    temp.next = newNode;
	    if (temp == tail) {
	        tail = newNode;
	    }
	}
	public void deleteBegin() {
		if(head==tail||head.next==tail) {
			head=tail=null;
			return;
		}
		else {
			tail.next=head.next;
			head=tail.next;
		}
	}
	public void deleteEnd() {
		if(head == null || head.next == tail) {
			head=tail=null;
			return;
		}
		Node temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
		}
		temp.next=head;
		tail=temp;
	}
	public void deleteValue(int key) {
		if(head.data==key) {
			head=head.next;
			tail.next=head;
			return;
		}
		Node temp=head;
		Node prev=null;
		while(temp.next != tail) {
			prev=temp;
			temp=temp.next;
			if(temp.data==key) {
				prev.next=temp.next;
				return;
			}
		}
	}
	public void display() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		
		list.insertBegin(10);
		list.insertBegin(20);
		list.insertEnd(60);
		list.insertEnd(70);
		list.insertPos(30, 2);
		list.display();
		list.deleteBegin();
		list.display();
		list.deleteEnd();
		list.display();
		list.deleteValue(30);
		list.display();
	}

}
