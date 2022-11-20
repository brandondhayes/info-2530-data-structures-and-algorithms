public class LinkedList
{
    private Link first;

    public LinkedList(long[] list)
    {
        first = null;
        for (int i = list.length-1; i >=0; i--)
        {
            insertFirst(list[i]);
        }
    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void insertFirst(long dd)
    {
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList()
    {
        System.out.print("      List (first -> last): ");
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("\n");
    }

    public boolean search(long query)
    {
        Link current = first;

        while (current.data != query)   // while we haven't found it yet
        {
            if (current.next == null)   // Reached end, stop search
                return false;
            else
                current = current.next; // go to next link
        }

        // Found a match, return it
        return true;
    }

    public int numberOfValues(long query)
    {
        int count = 0;
        Link current = first;

        while (current != null) 
        {
            if (current.data == query)
            {
                count++;
            }

            current = current.next;
        }

        return count;
    }

    public void replace(long a, long b)
    {
        Link current = first;

        while (current != null) 
        {
            if (current.data == a)
                current.data = b;

            current = current.next;
        }
    }

    public void zero()
    {
        Link current = first;

        while (current != null) 
        {
            current.data = 0;
            current = current.next;
        }
    }

    public long[] getArray()
    {
        long result[] = new long[getLength()];

        Link current = first;

        for (int i = 0; current != null; i++)
        {
            result[i] = current.data;
            current = current.next;
        }

        return result;
    }

    public int getLength()
    {
        int count = 0;
        Link current = first;

        while (current != null) 
        {
            count++;
            current = current.next;
        }

        return count;
    }
}