package oop;

public class SubclassB extends SuperClassA{
	SubclassB(){
		this(3);
		System.out.println("No-argument constructor in SubclassB");
	}
	
	SubclassB(int i){
		System.out.println("Non-zero argument constructor in SubclassB");
		value = i;
	}
	
	{
		System.out.println("instance initializer block in SubclassB");
		value = 2;
	}
	
	int value = initializerExpression();
	
	private int initializerExpression() {
		System.out.println("Instance initializer expression in SubclassB");
		return 1;
	}

}
