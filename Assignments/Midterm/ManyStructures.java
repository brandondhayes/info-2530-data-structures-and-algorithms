public class ManyStructures 
{
    private long[] data;

    public ManyStructures(int length)
    {
        data = new long[length];
    }

    public long[] getArray()
    {
        return data.clone();
    }

    public void setValue(int loc, long dat)
    {
        data[loc] = dat;
    }

    public long getValue(int loc)
    {
        return data[loc];
    }

    public int getLength()
    {
        return data.length;
    }

    public LinkedList getLinkedList()
    {
        LinkedList linkedList;

        linkedList = new LinkedList(getArray());

        return linkedList;
    }

    public Stack getStack()
    {
        Stack stack;

        stack = new Stack(data.length);

        // Load each item from "data" into the stack
        for (int i = 0; i < data.length; i++)
            stack.push(data[i]);

        return stack;
    }

    public Queue getQueue()
    {
        Queue queue;

        queue = new Queue(data.length);

        // Load each item into the queue
        for (int i = 0; i < data.length; i++)
            queue.insert(data[i]);

        return queue;
    }

    public void display()
    {
        System.out.print("ManyStructures: ");
        for (int i = 0; i < data.length; i++)
        {
            System.out.print("[" + i + "]" + data[i] + " ");
        }
    }
}
