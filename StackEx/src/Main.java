import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	
	private static void printStack(Stack<String> Strring) {
		if (Strring.isEmpty())
			System.out.println("Nothing in stack");
		else 
			System.out.printf("%s TOP\n" , Strring);
	}

}
