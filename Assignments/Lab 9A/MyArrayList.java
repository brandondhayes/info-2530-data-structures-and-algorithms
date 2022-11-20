public class MyArrayList
{
    private String[] data;
    private int dataCount;

    public MyArrayList(int size)
    {
        data = new String[size];
    }

    public void add(String text)
    {
        // Double length of array if it's full, and copy values over
        if (data.length == dataCount)
        {
            String[] temp = new String[data.length*2];

            for (int i = 0; i < data.length; i++) 
                temp[i] = data[i];

            data = temp;
        }

        data[dataCount] = text;

        dataCount++;
    }

    public String get(int index)
    {
        try 
        {
            return data[index];
        }
        catch(ArrayIndexOutOfBoundsException e) 
        {
            return null;
        }
    }

    public int size()
    {
        return data.length;
    }

    public int search(String query)
    {
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == query)
                return i;
        }

        return -1;
    }

    public int searchFromEnd(String query)
    {
        for (int i = data.length-1; i >= 0; i--)
        {
            if (data[i] == query)
                return i;
        }

        return -1;
    }

    public int findMatches(String query)
    {
        int count = 0;

        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == query)
                count++;
        }

        return count;
    }

    public int[] findMatchesArray(String query)
    {
        int count = 0;
        int[] results = new int[1];

        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == query)
            {
                if (count > 0)  // Expand results array by one
                {
                    int[] temp = new int[results.length+1];
    
                    for (int j = 0; j < results.length; j++) 
                        temp[j] = results[j];
    
                    results = temp;
                }

                results[count] = i;
                count++;
            }
        }

        return results;
    }

    public void debugPrintArray()
    {
        System.out.print("data: ");

        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == null)
                System.out.print("[null]");
            else
                System.out.print("[\"" + data[i] + "\"]");
        }

        System.out.println("");
    }
}