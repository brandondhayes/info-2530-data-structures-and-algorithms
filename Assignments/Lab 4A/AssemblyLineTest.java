public class AssemblyLineTest 
{
    public static void main(String[] args) 
    {
        AssemblyLine production;
        ManufacturedProduct completedProduct;
        production = new AssemblyLine();

        // Push 20 products through the assembly line
        for (int i = 0; i < 20; i++)
        {
            completedProduct = production.insertProduct(new ManufacturedProduct((1109200000 + i)));

            // Show the status of the completed unit, or an error if none have completed yet.
            if (completedProduct == null)
                System.out.println("Error: No units completed yet");
            else
                System.out.println(completedProduct);
        }
    }
}
