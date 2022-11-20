public class ManyLinkedListsDriver 
{
    public static void main(String[] args) 
    {
        DoubleEndedList del = ManyLinkedLists.createLinkedList(ManyLinkedLists.DOUBLEENDEDLIST);
        DoublyLinkedList dll = ManyLinkedLists.createLinkedList(ManyLinkedLists.DOUBLYLINKEDLIST);

        System.out.println("// Demonstrating double ended list");
        System.out.println("// Adding 5 values to front");
        del.insertFront(1111);
        del.insertFront(2222);
        del.insertFront(3333);
        del.insertFront(4444);
        del.insertFront(5555);

        del.displayList();

        System.out.println("// Adding three values to end");
        del.insertEnd(6666);
        del.insertEnd(7777);
        del.insertEnd(8888);

        del.displayList();


        System.out.println("");
        System.out.println("// Demonstrating doubly linked list");
        System.out.println("// Adding five values to front");

        dll.insertFront(1111);
        dll.insertFront(2222);
        dll.insertFront(3333);
        dll.insertFront(4444);
        dll.insertFront(5555);

        dll.displayList();

        System.out.println("// Adding three values to end");
        dll.insertEnd(6666);
        dll.insertEnd(7777);
        dll.insertEnd(8888);

        dll.displayList();

        System.out.println("// Inserting two values in middle of list");
        dll.insertAfter(3333, 4000);
        dll.insertAfter(4000, 4001);

        dll.displayList();

        System.out.println("// Deleting two values");
        dll.deleteLink(2222);
        dll.deleteLink(1111);

        dll.displayList();
        dll.displayReversedList();

    }
}
