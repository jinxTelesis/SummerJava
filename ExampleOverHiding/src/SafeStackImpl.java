
public class SafeStackImpl extends StackImpl implements ISafeStack{
	
	public SafeStackImpl(int capacity) {
		super(capacity);
	}
	
	@Override public boolean isEmpty() {return tos < 0;}
	@Override public boolean isFull() {return tos >= stackArray.length-1;}
	
	

}
