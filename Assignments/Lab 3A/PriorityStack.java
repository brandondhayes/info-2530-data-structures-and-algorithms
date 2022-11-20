public class PriorityStack
{
	private int maxSize; 					// size of stack array
	private Order[] stackArray;
	private int top; 						// top of stack

	public PriorityStack(int s) 					// constructor
	{
		maxSize = s; 						// set array size
		stackArray = new Order[maxSize]; 	// create array
		top = -1; 							// no items yet
	}

	public void push(Order j) 				// put item on top of stack
	{
		stackArray[++top] = j; 
	}

	public Order pop() 						// take item from top of stack
	{
		return stackArray[top--];
	}
	
	public Order peek() 					// peek at top of stack
	{
        if (!isEmpty())
		    return stackArray[top];
        else
            return null;
	}

	public boolean isEmpty() 				// true if stack is empty
	{
		return (top == -1);
	}

	public boolean isFull() 				// true if stack is full
	{
		return (top == maxSize-1);
	}

    public int numberOfOrders()
    {
        return top+1;
    }

    public void prioritySort()
    {
        int outer, inner;
        Order temp;
        for(outer=maxSize-1; outer>1; outer--) 
            for(inner=0; inner<outer; inner++) 
                if( stackArray[inner].getOrderPriority() < stackArray[inner+1].getOrderPriority() ) 
                {
                    temp = stackArray[inner];
                    stackArray[inner] = stackArray[inner+1];
                    stackArray[inner+1] = temp;
                }
    }

} 