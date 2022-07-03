
public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		linkedList.addFirst(70);
		linkedList.addFirst(56);
		linkedList.insertAtSpecificIndex(1, 30);
		linkedList.display();
		//linkedList.deleteLast();
		//linkedList.search(30);
		linkedList.searchAndInsert(30,40);
		linkedList.display();

	}

}
