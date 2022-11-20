public class HashTable
{
    private Record[] hashArray;
    private int arraySize;
    private Record deleted;

    public HashTable(int size)
    {
        arraySize = size;
        hashArray = new Record[arraySize];
        deleted = new Record(" ");
    }
    
    public void printTable()
    {
        System.out.print(" Hash Table: [");

        for (int i = 0; i < arraySize; i++)
        {
            if (hashArray[i] != null)
                System.out.print("[" + hashArray[i].getData() + "]");
            else
                System.out.print("[ ]");
        }

        System.out.print("]\n");

    }

    public int hashFunction(String key)
    {
        int hash = 0;

        for (int i = 0; i < key.length(); i++)
        {
            int letter = key.charAt(i) - 96;
            hash = (hash * 27 + letter) % arraySize;
        }

        return hash;
    }

    public Record find(String key)
    {
        int keyHash = hashFunction(key);

        while (hashArray[keyHash] != null)
        {
            if (hashArray[keyHash].getData() == key)
                return hashArray[keyHash];

            ++keyHash;
            keyHash %= arraySize;
        }

        return null;
    }

    public void insert(Record item)
    {
        int itemHash = hashFunction(item.getData());

        //if (item.getData() == "never take advice")
        System.out.println("*** HASH VALUE = " + itemHash);

        while (hashArray[itemHash] != null && hashArray[itemHash].getData() != "")
        {
            ++itemHash;
            itemHash %= arraySize;
        }

        hashArray[itemHash] = item;

        System.out.println(" Inserted string \"" + item.getData() + "\" into key " + itemHash);
    }


    public Record delete(String query)
    {
        int itemHash = hashFunction(query);

        while (hashArray[itemHash] != null)
        {
            if (hashArray[itemHash].getData() == query)
            {
                hashArray[itemHash] = deleted;
                System.out.println(" Deleted string \"" + query + "\" at key " + itemHash);
                return hashArray[itemHash];
            }
            ++itemHash;
            itemHash %= arraySize;
        }

        System.out.println(" Could not delete string \"" + query + "\": string not found");
        return null;
    }

}