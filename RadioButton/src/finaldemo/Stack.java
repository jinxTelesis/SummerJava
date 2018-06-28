package finaldemo;

public class Stack {
	
	private Object[] stackArray;
	private int topOfStack;
	
	synchronized public void push(Object elem) {
			stackArray[++topOfStack] = elem;
	}
	
	synchronized public Object pop() {
		Object obj = stackArray[topOfStack];
		stackArray[topOfStack] = null;
		topOfStack--;
		return obj;
	}
	
	public Object peek() { return stackArray[topOfStack];}
	
}
