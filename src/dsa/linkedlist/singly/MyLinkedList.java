package dsa.linkedlist.singly;

public class MyLinkedList {

	static Node head;

	public static void main(String[] args) {

		MyLinkedList ml = new MyLinkedList();
		head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		
		ml.printList();
		ml.push(4);
		ml.printList();
		ml.insertAfter(second, 6);
		ml.printList();
		ml.append(7);
		ml.printList();
		ml.delete(2);
		ml.printList();
	}
	
	void printList() {
		Node h = head;
		while(h != null) {
			System.out.print(h.data+" ");
			h = h.next;
		}
		System.out.println("\n");
	}

	static class Node {
		int data;
		Node next;

		Node(int i) {
			data = i;
		}
	}
	
	void push(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	void insertAfter(Node prev, int data) {
		if(prev == null)
			return;
		Node n = new Node(data);
		n.next = prev.next;
		prev.next = n;
	}
	
	void append(int last) {
		Node n = new Node(last);
		if(head == null)
			head = n;
		
		Node lastNode = head;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
		}
		lastNode.next = n;
	}
	
	void delete(int val) {
		
		Node temp = head, prev = null;
		if(temp.data == val)
			head = temp.next;
		while(temp != null && temp.data != val) {
			prev = temp;
			temp = temp.next;
		}
		if(temp == null) return;
		prev.next = temp.next;
	}
}
