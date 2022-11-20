public class PriorityStackDriver {
    public static void showData(PriorityStack stack)
    {
        System.out.print(" Peek: [" + stack.peek() + "]  Is Empty: [" + stack.isEmpty() + "]  Is Full: [" + stack.isFull() + "]  Number of Orders: [" + stack.numberOfOrders() + "]\n");
    }
    public static void showPopData(PriorityStack stack)
    {
        System.out.print(" Popping: [" + stack.peek() + "]   Number of Orders Remaining: [" + (stack.numberOfOrders()-1) + "]\n");
    }

    public static void main(String[] args) {
        // Create a new PriorityStack of 10
        PriorityStack stack;
        stack = new PriorityStack(10);
        
        // Show the status of the currently empty stack
        System.out.println("Status of new stack:");
        showData(stack);
        
        // Push 10 random orders onto the stack
        System.out.println("\nPushing 10 New Orders:");
        stack.push(new Order("B9WX7", 3));
        showData(stack);
        stack.push(new Order("BUXV5", 2));
        showData(stack);
        stack.push(new Order("1LGI6", 2));
        showData(stack);
        stack.push(new Order("RG9BW", 3));
        showData(stack);
        stack.push(new Order("T1ALW", 3));
        showData(stack);
        stack.push(new Order("94ONU", 1));
        showData(stack);
        stack.push(new Order("UQPPD", 1));
        showData(stack);
        stack.push(new Order("PRG1M", 2));
        showData(stack);
        stack.push(new Order("Y1C2T", 1));
        showData(stack);
        stack.push(new Order("XKDJF", 3));

        // Peek the full stack
        showData(stack);

        // Sort the stack by priority
        System.out.println("\n***Sorting All Orders by Priority***\n");
        stack.prioritySort();

        // Peek the sorted stack
        showData(stack);

        // Pop the whole stack
        System.out.println("\nPopping All Orders:");

        // Pop each item until stack is empty
        while (!stack.isEmpty())
        {
            showPopData(stack);
            stack.pop();
        }
    }
}
