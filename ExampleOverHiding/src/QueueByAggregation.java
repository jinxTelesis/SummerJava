
public class QueueByAggregation {
	private LinkedList qList;
	
	QueueByAggregation(){
		qList = new LinkedList();
	}
	
	public boolean isEmpty() { return qList.isEmpty();}
	public void enqueue(Object item) {qList.insertAtBack(item);}
	public Object dequeue() {
		if (qList.isEmpty()) return null;
		return qList.deleteFormFront();
	}
	
	public Object peek() {
		return (qList.isEmpty() ? null : qList.head.getData());
	}

}
