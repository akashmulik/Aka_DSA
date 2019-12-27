package dsa.linkedlist.circular;

public class InsertInSortedList {

	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static void main(String[] args) {
	
		Node n1 = new Node(1);
		Node n2 = new Node(4);
		Node n3 = new Node(6);
		Node n4 = new Node(7);
		Node n5 = new Node(9);
		Node n6 = new Node(10);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n1;
		
		InsertInSortedList isl = new InsertInSortedList();
		isl.traverse(n6);
	}

	void traverse(Node last) {
		if(last == null) {
			System.out.println("Empty list!");
			return;
		}
		Node n = last.next;
		
		do {
			System.out.print(n.data+" ");
			n = n.next;
		} while(n != last);
	}
	
	void insertInSorted(Node last, Node n) {
		
		
	}
}