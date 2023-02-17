import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of objects:- ");
        int count = sc.nextInt();

        ArrayList<KnapsackObject> List = new ArrayList<>();
        System.out.println("Enter the weights and profits of each object:");
        for(int i = 0; i < count; i++){
            KnapsackObject object = new KnapsackObject(sc.nextDouble(), sc.nextDouble());
            List.add(object);
        }

        //Prints initial array
        for (KnapsackObject o : List) {
            System.out.println(" Weight:" + o.getWeight() + " Profits:" + o.getValue() + " Density:" +o.getDensity());
        }


        //Sort the objects descending
        List.sort(KnapsackObject::compareTo);

        //Prints sorted array
        System.out.println("SORTED:");
        for (KnapsackObject o : List) {
            System.out.println(" Weight:" + o.getWeight() + " Profits:" + o.getValue() + " Density:" +o.getDensity());
        }

        System.out.println("Enter the capacity of the knapsack:-");
        float capacity = sc.nextFloat();

        float curr_capacity = capacity;
        float max_profit = 0;
        for (KnapsackObject o: List) {
            float curr_item = 0;
            //Add parts of the item until it gets full
            while(curr_item != o.getWeight())
            {
                if(curr_capacity >= o.getDensity())
                {
                    curr_item += o.getDensity();
                    curr_capacity -= o.getDensity();
                    max_profit += o.getDensity() * o.getValue();
                }
            }
        }

        System.out.println("Max Profit: " + max_profit);
    }

}