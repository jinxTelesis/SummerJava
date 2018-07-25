
public class LinkedList {
	
	protected Node head = null;
	protected Node tail = null;
	
	public boolean isEmpty() {return head == null;}
	public void insertInFront(Object dataObj) {
		if(isEmpty()) head = tail= new Node(dataObj, null);
		else head = new Node(dataObj,head);
	}
	
	public void insertAtBack(Object dataObj) {
		if(isEmpty())
			head = tail = new Node(dataObj,null);
		else {
			tail.setNext(new Node(dataObj, null));
			tail = tail.getNext();
		}
	}
	
	public Object deleteFormFront() {
		if(isEmpty()) return null;
		Node removed = head;
		if(head == tail) head = tail = null;
		else head = head.getNext();
		return removed.getData();
	}

}
