package doublylinkedlist;


public class DeleteFirst {
	private Node head;
	private Node tail;
	private int length;
	
	public DeleteFirst() {
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
	
	public Node deleteFirst() {
		if(isEmpty()) {
			return null;
		}
		else if(head==tail) {
			tail=tail.next;
			head=tail.next;
			length--;
			return tail;
		}else {
			Node temp=head;
			head.next.previous=null;
			head=head.next;
			temp.next=null;
			length--;
			return temp;
		}
		
	}//delete first node
	
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
		DeleteFirst dll=new DeleteFirst();
		dll.insertAtEnd(10);
		dll.insertAtEnd(11);
		dll.insertAtEnd(12);
		dll.insertAtEnd(13);
		dll.insertAtEnd(14);
		System.out.println(dll.getLength());
		dll.deleteFirst();
		dll.deleteFirst();
		dll.displayForword();
		System.out.println();
		System.out.println(dll.getLength());
	}
}
