public class LinkedListDriver 
{
    public static void main(String[] args) 
    {
        long[] startingValues = {12,33,12,45,67,98,67,67,32,11,43};
        LinkedList theList;

        System.out.println("Creating new linked list...");
        theList = new LinkedList(startingValues);

        System.out.println("isEmpty(): " + theList.isEmpty());
        theList.displayList();

        System.out.println("Adding new item to list...");
        theList.insertFirst(287);
        theList.displayList();

        System.out.println("Deleting item from list...");
        theList.deleteFirst();
        theList.displayList();

        System.out.println("Search: 45");
        System.out.println("Result: " + theList.search(45) + "\n");


        System.out.println("Search: 9999");
        System.out.println("Result: " + theList.search(9999) + "\n");



        System.out.println("Checking to see how many times 67 is present in the list...");
        System.out.println("Occurrences: " + theList.numberOfValues(67) + "\n");
        System.out.println("Checking to see how many times 9999 is present in the list...");
        System.out.println("Occurrences: " + theList.numberOfValues(9999) + "\n");


        theList.displayList();
        
        System.out.println("Replacing all occurrences of 67 with 9999...");
        theList.replace(67,9999);
        theList.displayList();

        System.out.println("Printing individual items on linked list as array...");

        long[] listArray = theList.getArray();
        System.out.println("listArray[0] = " + listArray[0]);
        System.out.println("listArray[2] = " + listArray[2]);
        System.out.println("listArray[6] = " + listArray[6]);



        System.out.println("Zeroing out the list...");
        theList.zero();
        theList.displayList();




        //theList.zero();
        //theList.displayList();
        //System.out.print(theList.getLength());
        //System.out.print(theList.numberOfValues(12));
        //System.out.print(theList.getArray()[0]);

    }
}
