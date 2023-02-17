import java.util.ArrayList;
import java.util.Scanner;

public class AaronWork {
    public static void main(String[] args) {
        ArrayList<KnapsackObject> knapsackObjects = new ArrayList<KnapsackObject>();
        int nObjects = 0;
        float capacity = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of objects:");

        nObjects = sc.nextInt();
        System.out.println("Enter the weights and profits of each objects:");
        for(int i = 0; i < nObjects; i++)
        {
            knapsackObjects.add(new KnapsackObject(sc.nextFloat(), sc.nextFloat()));
        }

        System.out.println("Enter the capacity of the knapsack:");
        capacity = sc.nextFloat();


    }
}