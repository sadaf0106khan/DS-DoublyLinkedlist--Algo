package doublylinkedlist;


public class DeleteEnd {
	private Node head;
	private Node tail;
	private int length;
	
	public DeleteEnd() {
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
	
	public Node deleteEnd() {
		if(isEmpty()) {
			return tail;
		}else if(tail==head) {
			head=head.next;
			tail=tail.next;
			length--;
			return head;
		}else {
			Node temp=tail;
			tail=temp.previous;
			tail.next=null;
			length--;
			return temp;
		}
	
		
	}//delete last node
	
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
		DeleteEnd dll=new DeleteEnd();
		dll.insertAtEnd(10);
		dll.insertAtEnd(11);
		dll.insertAtEnd(12);
		dll.insertAtEnd(13);
		dll.insertAtEnd(14);
		System.out.println(dll.getLength());
		dll.deleteEnd();
		dll.deleteEnd();
		dll.displayForword();
		System.out.println();
		System.out.println(dll.getLength());
	}
}
