
public class main extends MySuperclass  {
	
	public static void main (String[] args) throws InvalidHoursException {
		
		TubeLight tubeLight = new TubeLight();
		Light light1 = tubeLight;
		Light light2 = new Light();
		
		tubeLight.energyCost(50); // this invokes the subclass
		light1.energyCost(50); // this invokes the subclass because it is an aliases 
		light2.energyCost(50); // this invokes the more general class because it is it is on the light class
		
		main object = new main(); 
		object.print();
	
		Car c = new Car();
		Vehicle v = c;
		
		
		// Inheritance versus aggregation example
		String string1 = "Queues are boring to stand in!";
		int length1 = string1.length();
		QueueByAggregation queue = new QueueByAggregation();
		for (int i = 0; i<length1; i++)
		{
			queue.enqueue(new Character(string1.charAt(i)));
		}
		
		while (!queue.isEmpty())
		{
			System.out.println(queue.dequeue());
		}
		System.out.println();
		
		String string2 = "!no tis ot nuf era skcatS";
		int length2 = string2.length();
		
		StackByInheritance stack = new StackByInheritance();
		
		for (int i = 0; i<length2; i++)
		{
			stack.push(new Character(string2.charAt(i)));
		}
		
		stack.insertAtBack(new Character('!'));
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		System.out.println();
		/// not done
		/// not done
	}
	
	public void print() {
		System.out.println(msg.text);
	}

}
