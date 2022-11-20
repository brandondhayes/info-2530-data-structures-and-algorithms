public class MyArrayListDriver 
{
    public static void main(String[] args) 
    {
        MyArrayList list = new MyArrayList(5);  //creates an encapsulated array with 5 elements within the MyArrayList object.

        list.add("Alpha");   //the array contains ["Alpha"][null][null][null][null]
        list.debugPrintArray();
        list.add("Beta");    //the array contains ["Alpha"]["Beta"][null][null][null]
        list.debugPrintArray();
        list.add("Gamma");   //the array contains ["Alpha"]["Beta"]["Gamma"][null][null]
        list.debugPrintArray();
        list.add("Delta");   //the array contains ["Alpha"]["Beta"]["Gamma"]["Delta"][null]
        list.debugPrintArray();
        list.add("Epsilon"); //the array contains ["Alpha"]["Beta"]["Gamma"]["Delta"]["Epsilon"]
        list.debugPrintArray();
        list.add("Alpha");   //the array contains ["Alpha"]["Beta"]["Gamma"]["Delta"]["Epsilon"]["Alpha"][null][null][null][null]
        list.debugPrintArray();
    
        System.out.print("list.size(): ");
        System.out.println(list.size());  //displays "10";

        System.out.print("list.search(\"Alpha\"): ");
        System.out.println(list.search("Alpha")); //displays "0".

        System.out.print("list.searchFromEnd(\"Alpha\"): ");
        System.out.println(list.searchFromEnd("Alpha")); //displays "5".

        System.out.print("list.findMatches(\"Alpha\"): ");
        System.out.println(list.findMatches("Alpha")); //displays "2".

        System.out.print("list.findMatchesArray(\"Alpha\"): ");
        int[] arr = list.findMatchesArray("Alpha");

        System.out.println("");
        for(int x: arr){ System.out.println(x);}
        // the above displays "0" and "5".
        
        System.out.print("list.get(2): ");
        System.out.println(list.get(2)); //displays "Gamma"

        //list.debugPrintArray();
    }
}
