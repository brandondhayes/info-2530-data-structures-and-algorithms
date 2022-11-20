public class Stack 
{
    private int length;
    private long[] data;
    private int top;

    public Stack(int size)
    {
        length = size;
        data = new long[length];
        top = -1;
    }

    public void push(long x)
    {
        data[++top] = x;
    }

    public long pop()
    {
        return data[top--];
    }

    public long peek()
    {
        return data[top];
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public void display()
    {
        System.out.print("      Stack: ");

        if (isEmpty())
        {
            System.out.print("empty");
        } else {
            for (int i = 0; i < top+1; i++)
            {
                System.out.print("[" + i + "]=" + data[i] + "  ");
            }
            
        }
        System.out.println("");
    }

}
