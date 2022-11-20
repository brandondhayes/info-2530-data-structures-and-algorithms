public class ManyStructuresDriver 
{
    public static void main(String[] args) 
    {
        // Initialize our ManyStructures variable
        ManyStructures info = new ManyStructures(6);

        // Set up our initial values
        info.setValue(0, 111);
        info.setValue(1, 222);
        info.setValue(2, 333);
        info.setValue(3, 444);
        info.setValue(4, 555);
        info.setValue(5, 666);

        // Demonstrate getArray() function
        System.out.print("//======================================================\n" +
                            "// getArray() function\n" + 
                            "//======================================================\n");
        System.out.print("     Showing values returned as an array...\n" + 
                            "      Array: ");

        for (int i = 0; i < info.getLength(); i++)
        {
            System.out.print(" [" + i + "]=" + (info.getArray())[i] + " ");
        }

        System.out.println("\n");

        // Demonstrate getQueue() function
        System.out.print("//======================================================\n" +
        "// getQueue() function\n" + 
        "//======================================================\n");
        Queue queue;

        queue = info.getQueue();

        System.out.print("     Showing values returned as a queue...\n ");
        queue.display();

        System.out.println("     Removing some values...");
        System.out.println("      Removed " + queue.remove());
        System.out.println("      Removed " + queue.remove());
        System.out.println("      Removed " + queue.remove());
        queue.display();

        System.out.println("     Inserting some values...");
        queue.insert(777);
        queue.insert(888);
        queue.insert(999);

        System.out.println("     Clearing the queue...");
        while (!queue.isEmpty())
        {
            System.out.println("      Removed " + queue.remove());
        }



        System.out.println("\n");


        // Demonstrate getStack function
        System.out.print("//======================================================\n" +
        "// getStack() function\n" + 
        "//======================================================\n");
        Stack stack;

        stack = info.getStack();

        System.out.print("     Showing values returned as a stack...\n ");
        stack.display();

        System.out.println("\n");

        
        System.out.println("     Removing 3 values...");
        System.out.println("      Removed " + stack.pop());
        System.out.println("      Removed " + stack.pop());
        System.out.println("      Removed " + stack.pop());
        stack.display();

        System.out.println("     Inserting 2 values...");
        stack.push(777);
        stack.push(888);
        // stack.push(999);

        stack.display();

        System.out.println("     Clearing the stack...");
        while (!stack.isEmpty())
        {
            System.out.println("      Removed " + stack.pop());
        }



        // Demonstrate getLinkedList function
        System.out.print("//======================================================\n" +
        "// getLinkedList() function\n" + 
        "//======================================================\n");
        LinkedList linkedList;
        linkedList = info.getLinkedList();


        linkedList.displayList();
        
        System.out.println("     Deleting 2 items from beginning of list...");

        linkedList.deleteFirst();
        linkedList.deleteFirst();

        linkedList.displayList();

        System.out.println("     Inserting 3 items into beginning of list...");
        linkedList.insertFirst(777);
        linkedList.insertFirst(888);
        linkedList.insertFirst(999);
        linkedList.displayList();


    }

}
