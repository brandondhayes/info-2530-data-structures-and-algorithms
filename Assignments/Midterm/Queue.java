public class Queue 
{
    private int length;
    private long[] data;
    private int front, rear, count;

    public Queue(int size)
    {
        length = size;
        data = new long[length];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void display()
    {
        System.out.print("      Queue: ");

        if (isEmpty())
        {
            System.out.print("empty");
        } 
        else 
        {
            for (int i = front; i <= rear; i++)
                System.out.print("[" + i + "]=" + data[i] + "  ");
        }
        System.out.println("");
    }

    public void insert(long x)
    {
        if (rear == length-1)
            rear = -1;
        data[++rear] = x;
        count++;
    }

    public long remove()
    {
        long temp = data[front++];

        if (front == length)
            front = 0;
        count--;

        return temp;
    }

    public long peek()
    {
        return data[front];
    }

    public boolean isEmpty()
    {
        return (count == 0);
    }

    public boolean isFull()
    {
        return (count == length);
    }

    public int size()
    {
        return count;
    }

}
