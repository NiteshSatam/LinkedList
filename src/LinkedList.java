
public class LinkedList {

	Node head; // null

	class Node {
		Object data; // int, double,long....etc
		Node next;

		public Node(Object data) { // constructor
			this.data = data;
		}

	}

	public int size() {
		int count = 0;

		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void addFirst(Object data) {
		Node newNode = new Node(data); // Creating new node

		if (head == null)
			head = newNode; // linked list is empty then add directly
		else {
			Node temp = head; // it not empty copy to temp node
			head = newNode;
			head.next = temp;
		}

	}

	public void addLast(Object data) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode; // head=>[1 |null ] // list is notempty
		else {

			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;
		}

	}

	public void insertAtSpecificIndex(int userIndex, Object data) {

		// User trying to insert @ first position
		if (userIndex == 0)
			addFirst(data);

		// // User trying to insert @ last position
		/*
		 * 56,30,70 0 1 2
		 * 
		 * 2
		 * 
		 * user entered 3 56,30,70,80
		 * 
		 */

		else if (userIndex == size())
			addLast(data);

		// User trying to insert @ invalid position
		else if (userIndex < 0 || userIndex >= size())
			System.out.println("Invalid index");

		// User trying to insert @ specific index
		else {
			// Creating New Node
			Node newNode = new Node(data);

			// To track traversing
			int index = 0;

			// Pointers to track left & right side elements
			Node left = head;
			Node right = left.next;

			// Traverse or Move till last element before user entered index
			while (index < userIndex - 1) {
				left = left.next;
				right = right.next;
				index++;
			}

			// Connecting new Node with right side elements
			newNode.next = right;

			// Connecting left side elements with new Node
			left.next = newNode;
		}
	}

	public void deleteFirst() {
		if (head == null)
			System.out.println("No elements to delete.");
		else if (head.next == null)
			head = null;
		else {
			Node temp = head.next;
			head = temp;

		}
	}

	public void deleteLast() {
		if (head == null)
			System.out.println("No elements to delete");
		else if (head.next == null)
			head = null;
		else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}

	}

	public void search(Object searchData) {
		if (head.data == searchData)
			System.out.println(searchData + " is Found");
		else {
			Node temp = head;

			boolean isFound = false;

			while (temp != null) {
				if (temp.data == searchData) {
					isFound = true;
					break;
				}
				temp = temp.next;

			}

			if (isFound == true)
				System.out.println(searchData + " is Found");
			else
				System.out.println(searchData + " is not Found");

		}
	}

	public void display() {

		if (head == null) {
			System.out.println("No elements to display");
		} else if (head.next == null)
			System.out.println(head.data);

		else {
			Node temp = head;
			while (temp != null) {
				if (temp.next != null)
					System.out.print(temp.data + "->");
				else
					System.out.println(temp.data + "\n");

				temp = temp.next;
			}
		}
	}

}
