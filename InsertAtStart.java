package doublylinkedlist;

public class InsertAtStart {

	private Node head;
	private Node tail;
	private int length;
	
	public InsertAtStart() {//constructor
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	private class Node{
		int data;
		Node privous;
		Node next;
		private Node(int data) {//constructor
			this.data=data;
		}
	}//inner class close
	
	
	public boolean isEmpty() {
		return length==0;//or head==null
	}//check for empty
	
	public int Length() {
		return length;
	}//for finding length
	
	
	public void insertAtStart(int data) {
		Node node = new Node(data);
		if(isEmpty()) {
			tail=node;
		}else {
			head.privous=node;
		}
		node.next=head;
		head=node;
		length++;
	}//insert at start
	
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
			temp=temp.privous;
		}
		System.out.print(temp);
	}//backword direction me print
	
	public static void main(String[] args) {
		InsertAtStart dll=new InsertAtStart();
		
		dll.displayForword();System.out.println();
		System.out.println(dll.Length());
		dll.insertAtStart(1);
		dll.insertAtStart(2);
		dll.insertAtStart(3);
		dll.insertAtStart(4);
		dll.insertAtStart(5);
		dll.displayForword();System.out.println();
		System.out.println(dll.Length());
		dll.displayBackword();
	}//runner method
	
	
	
}//outer class close
