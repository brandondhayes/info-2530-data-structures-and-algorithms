import java.util.Random;

public class Numbers 
{
    private int[] array;

    public Numbers(int max)
    {
        array = new int[max];
    }
    
    public void display()
    {
        System.out.print("  Array values: ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println("");
    }

    public void randomize()
    {
        Random ran = new Random();

        for (int i = 0; i < array.length; i++)
        {
            array[i] = ran.nextInt(100);
        }
    }

    public void bubbleSort()
    {
        int outer, inner, temp;
        for(outer=array.length-1; outer>1; outer--) 
            for(inner=0; inner<outer; inner++) 
                if( array[inner] > array[inner+1] ) 
                {
                    temp = array[inner];
                    array[inner] = array[inner+1];
                    array[inner+1] = temp;
                }
    }

    public void selectionSort()
    {
        int outer, inner, min, temp;
        for(outer=0; outer<array.length-1; outer++)
        {
            min = outer;
            for(inner=outer+1; inner<array.length; inner++)
                if(array[inner] < array[min] ) 
                    min = inner; 
                temp = array[outer];
                array[outer] = array[min];
                array[min] = temp;
        }
    }

    public void insertionSort()
    {
        int inner, outer;
        
        for(outer=1; outer<array.length; outer++)
        {
            int temp = array[outer];
            inner = outer; 
            while(inner>0 && array[inner-1] >= temp) 
            {
                array[inner] = array[inner-1];
                --inner; 
            }
            array[inner] = temp; 
        }
    }

    public void setValue(int index, int value)
    {
        try
        {
            if (value < 0) 
                array[index] = 0;
            else if (value > 100) 
                array[index] = 100;
            else 
                array[index] = value;

        } 
        catch (Exception e)
        {
            System.out.println("Error: setValue Index out of bounds");
        }
    }

    public int getValue(int index)
    {
        try
        {
            return array[index];
        } 
        catch (Exception e)
        {
            System.out.println("Error: getValue Index out of bounds");
            return 0;
        }
        
    }

    public int getLength()
    {
        return array.length;
    }
}
