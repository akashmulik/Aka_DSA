package dsa.linkedlist.circular;

public class CLLOperations {

	static Node head;
	
	public static void main(String[] args) {

		Node last = new Node(10);
		Node first = new Node(1);
		last.next = first;
		Node second = new Node(2);
		first.next = second;
		Node third = new Node(3);
		second.next = third;
		third.next = last;

		CLLOperations cll = new CLLOperations();
		cll.traverse(last);
	}

	// Node
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node insertIntoEmpty(int data, Node last) {
		
		if(last != null)
			return last;

		last = new Node(data);
		return last.next = last;
	}
	
	Node addAtBegin(int data, Node last) {
		if(last == null) {
			return insertIntoEmpty(data, last);
		}
		Node temp = new Node(data);
		temp.next = last.next;
		last.next = temp;
		return last;
	}
	
	Node addAtEnd(int data, Node last) {
		if(last == null)
			return insertIntoEmpty(data, last);
		
		Node temp = new Node(data);
		temp.next = last.next;
		last.next = temp;
		
		return temp;
	}
	
	void traverse(Node last) {
		if(last == null) {
			System.out.println("List is empty..!!");
			return;
		}
		Node n = last.next;
		
		do {
			System.out.print(n.data+ " ");
			n = n.next;
		} while(n != last);
	}
}
