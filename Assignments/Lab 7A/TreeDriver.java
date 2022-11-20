import java.io.*;

public class TreeDriver
{
    public static void main(String[] args) throws IOException 
    {
        //int value;

        Tree theTree = new Tree();

        while (true)
        {
            System.out.print("Type a letter to add it to the tree: ");

            // getString();
            //theTree.addNode(getChar());

        }

    }

    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException
    {
        String s = getString();
        return s.charAt(0);
    }
}