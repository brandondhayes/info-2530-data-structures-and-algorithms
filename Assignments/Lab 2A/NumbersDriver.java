public class NumbersDriver {
    
    public static void main(String[] args) {

        // Instantiate the numbers array with a length of 10
        Numbers array;
        array = new Numbers(10);

        //======================================
        // Bubble sort
        //======================================

        System.out.println("Bubble Sort");

        // Randomize and display array
        array.randomize();
        System.out.println(" Randomized array");
        array.display();

        // Sort and display array
        array.bubbleSort();
        System.out.println(" Sorted array");
        array.display();
        System.out.println("");


        //======================================
        // Selection sort
        //======================================
        System.out.println("Selection Sort");

        // Randomize and display array
        array.randomize();
        System.out.println(" Randomized array");
        array.display();

        // Sort and display array
        array.selectionSort();
        System.out.println(" Sorted array");
        array.display();
        System.out.println("");


        //======================================
        // Insertion sort
        //======================================
        System.out.println("Insertion Sort");

        // Randomize and display array
        array.randomize();
        System.out.println(" Randomized array");
        array.display();

        // Sort and display array
        array.insertionSort();
        System.out.println(" Sorted array");
        array.display();
        System.out.println("");

    }
}
