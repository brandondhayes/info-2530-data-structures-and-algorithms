public class DoublyLinkedList 
{
    private Link first;
    private Link last;

    public DoublyLinkedList()
    {
        first = null;
        last = null;
    }

    public void insertFront(long d)
    {
        Link newLink = new Link(d);

        if (first == null)
            last = newLink;
        else
            first.previous = newLink;

        newLink.next = first;

        first = newLink;
    }

    public void insertEnd(long d)
    {
        Link newLink = new Link(d);

        if (first == null)
            first = newLink;
        else
        {
            last.next = newLink;
            newLink.previous = last;
        }

        last = newLink;
    }

    public Link deleteFront()
    {
        Link temp = first;

        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;

        return temp;
    }

    public Link deleteEnd()
    {
        Link temp = last;

        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;

        return temp;
    }

    public boolean insertAfter(long key, long d)
    {
        Link current = first;

        // Cycle through each link until we find 'key'
        while (current.data != key)
        {
            current = current.next;

            if (current == null)
                return false;
        }

        Link newLink = new Link(d);

        if (current == last)
        {
            newLink.next = null;
            last = newLink;
        }
        else
        {
            newLink.next = current.next;
            current.next.previous = newLink;
        }

        newLink.previous = current;
        current.next = newLink;

        return true;
    }

    public Link deleteLink(long query)
    {
        Link current = first;

        // Cycle through each link until we find 'query'
        while (current.data != query)
        {
            current = current.next;

            if (current == null)
                return null;
        }

        if (current == first)
            first = current.next;
        else
            current.previous.next = current.next;

        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;

        return current;
    }

    public void displayList()
    {
        System.out.print("   Doubly Linked List: ");

        Link current = first;

        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }

        System.out.println("");
    }
    public void displayReversedList()
    {
        System.out.print("   Doubly Linked List (reversed order): ");

        Link current = last;

        while (current != null)
        {
            current.displayLink();
            current = current.previous;
        }

        System.out.println("");
    }
}
