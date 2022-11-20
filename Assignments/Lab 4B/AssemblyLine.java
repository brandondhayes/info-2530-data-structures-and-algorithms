public class AssemblyLine
{
    private int numberOfStations = 5;
    private ManufacturedProduct[] assemblyLine;

    public AssemblyLine()
    {
        assemblyLine = new ManufacturedProduct[numberOfStations];
    }

    public int lineLength()
    {
        return numberOfStations;
    }

    public ManufacturedProduct insertProduct(ManufacturedProduct product)
    {
        ManufacturedProduct finishedProduct;

        // Save the last item in our queue
        finishedProduct = assemblyLine[numberOfStations-1];

        // Shift all other products up the line
        for (int i = numberOfStations -2; i>-1; i--)
        {
            assemblyLine[i+1] = assemblyLine[i];
        }

        // Insert new product into the queue
        assemblyLine[0] = product;

        // Inspect the finished product
        if (finishedProduct!= null)
            finishedProduct.doInspection();
        
        // Return the finished object
        return finishedProduct;
    }
}