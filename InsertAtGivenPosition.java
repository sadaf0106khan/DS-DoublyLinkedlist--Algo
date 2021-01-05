package doublylinkedlist;

import doublylinkedlist.InsertAtEnd.Node;

public class InsertAtGivenPosition {
	private Node head;
	private Node tail;
	private int length;
	
	public InsertAtGivenPosition() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}//first and last node construction
	
	public boolean isEmpty() {
		return length==0;
	}//for checking list is empty or not
	
	public int getLength() {
		return length;
	}
	public class Node{
		int data;
		Node next;
		Node previous;
		public Node(int data) {
			this.data=data;
		}//node construction
		
	}//node inner class
	
	public void insertAtGivenPosition(int index,int data) {
		Node node=new Node(data);
		if(index>getLength()) {
			System.out.println("invalid index");
		}
		else if(index==1) {
			head=node;
		}else {
			Node temp=head;
			for(int i=1;i<index-1;i++) {
				temp=temp.next;
			}
			temp.next.previous=node;
			node.next=temp.next;
			node.previous=temp;
			temp.next=node;
		}
		length++;
	}//insert at given position
	
	public void insertAtEnd(int data) {
		Node node=new Node(data);
		if(isEmpty()) {
			head=node;
		}else {
			tail.next=node;
		}
		node.previous=tail;
		tail=node;
		length++;
	}//insert at end
	
	public void displayForword() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print(temp);
	}//forword direction me print
	
	public void displayBackword() {
		Node temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.previous;
		}
		System.out.print(temp);
	}//backword direction me print
	
	public static void main(String[] args) {
		InsertAtGivenPosition dll=new InsertAtGivenPosition();
		dll.insertAtEnd(10);
		dll.insertAtEnd(11);
		dll.insertAtEnd(12);
		dll.insertAtEnd(13);
		dll.insertAtEnd(14);
		System.out.println(dll.getLength());
		dll.insertAtGivenPosition(7, 121);
		dll.displayForword();
		System.out.println();
		System.out.println(dll.getLength());
	}
}
