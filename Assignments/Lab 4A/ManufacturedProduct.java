import java.util.Random;

public class ManufacturedProduct 
{
    private int productId;
    private boolean passedInspection;

    public ManufacturedProduct(int id)
    {
        productId = id;
        passedInspection = false;
    }

    public int getProductId()
    {
        return productId;
    }

    public String toString()
    {
        return "Unit Completed   Product ID: " + productId + "   Passed Inspection: " + passedInspection;
    }

    public void doInspection()
    {
        Random ran = new Random();

        if (ran.nextInt(19) == 0)
            passedInspection = false;
        else 
            passedInspection = true;

    }
}
