
public class Node {
	
	private Object data;
	private Node next;
	
	Node(Object data, Node next){
		this.data = data;
		this.next = next;
	}
	
	// Methods:
	public void setData(Object obj) { data = obj;}
	public Object getData() { return data;}
	public void setNext(Node node) {next= node;}
	public Node getNext() {return next;}
	
	

}
