
public class B extends A{
	
	B(String s) {System.out.println(s);}
	B(String s, String t) {this(t + s + "3");}
	B() {super("4");};

}
