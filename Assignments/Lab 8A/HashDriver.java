public class HashDriver 
{
    public static void main(String[] args) 
    {
        HashTable hashTable = new HashTable(47);

        System.out.println("// Showing new, empty hash table");
        hashTable.printTable();


        System.out.println("// Inserting random strings");
        hashTable.insert(new Record("refused to follow"));
        hashTable.insert(new Record("lives waiting"));
        hashTable.insert(new Record("blue parrot"));
        hashTable.insert(new Record("single flip"));
        hashTable.insert(new Record("became confused"));
        hashTable.insert(new Record("too short"));
        hashTable.insert(new Record("key lime pie"));
        hashTable.insert(new Record("looked more like a horse"));
        hashTable.insert(new Record("greatest criminal mastermind"));
        hashTable.insert(new Record("advised him to come back"));
        hashTable.insert(new Record("amazed by the large chunks of ice"));
        hashTable.insert(new Record("sound like that"));
        hashTable.insert(new Record("went on a whiskey diet"));
        hashTable.insert(new Record("interesting turtle"));
        hashTable.insert(new Record("tour bus was packed"));
        hashTable.insert(new Record("create a random sentence"));
        hashTable.insert(new Record("a stairway to heaven and a highway to hell"));
        hashTable.insert(new Record("commit crimes as a snake"));

    
        System.out.println("// Showing populated hash table");
        hashTable.printTable();

        System.out.println("// Removing records from hash table");
        hashTable.delete("too short");
        hashTable.delete("single flip");
        hashTable.delete("lives waiting");
        hashTable.delete("say what now");

        System.out.println("// Showing modified hash table");
        hashTable.printTable();
    }    
}
