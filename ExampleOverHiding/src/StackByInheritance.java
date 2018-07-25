
public class StackByInheritance extends LinkedList {
	public void push(Object item) {insertInFront(item);}
	public Object pop() {
		if (isEmpty()) return null;
		return deleteFormFront();
	}
	public Object peek() {
		return (isEmpty() ? null : head.getData());
	}

}
