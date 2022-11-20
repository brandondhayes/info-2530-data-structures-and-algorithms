public class Link 
{
    public long data;
    public Link next;

    public Link(long dd)
    {
        data = dd;
    }

    public void displayLink()
    {
        System.out.print("{" + data + "} ");
    }
}
