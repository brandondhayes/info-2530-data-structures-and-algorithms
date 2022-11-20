public class DoubleEndedList 
{
    private Link first;
    private Link last;

    public DoubleEndedList()
    {
        first = null;
        last = null;
    }

    public void insertFront(long data)
    {
        Link newLink = new Link(data);

        if (first == null)
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertEnd(long data)
    {
        Link newLink = new Link(data);

        if (first == null)
            first = newLink;
        else
            last.next = newLink;
        
        last = newLink;
    }

    public long deleteFront()
    {
        long temp = first.data;

        if (first.next == null)
            last = null;

        first = first.next;

        return temp;
    }

    public void displayList()
    {
        System.out.print("   Double Ended List: ");

        Link current = first;

        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }

        System.out.println("");
    }
}
