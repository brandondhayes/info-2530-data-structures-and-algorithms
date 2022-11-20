import java.util.Random;

public class Recursion
{
    public static void main(String[] args) 
    {
        // Start recursive function with zeroes
        int[] vars = {0,0};
        numberGenerator(vars);
    }

    public static void numberGenerator(int[] vars)
    {
        // Generate random number
        Random ran = new Random();
        int randomNumber = ran.nextInt(20) + 1;

        vars[0]++;
        vars[1] += randomNumber;

        System.out.println("Run " + (vars[0]) + ", random number " + randomNumber);

        if (randomNumber == 20)
        {
            System.out.println("Run ended. The total of the random numbers is " + vars[1]);
        }
        else
        {
            numberGenerator(vars);
        }
    }
}