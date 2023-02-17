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
        /*
        for (KnapsackObject o : List) {
            System.out.println(" Weight:" + o.getWeight() + " Profits:" + o.getValue() + " Density:" +o.getDensity());
        }*/


        //Sort the objects descending
        List.sort(KnapsackObject::compareTo);

        //Prints sorted array
        System.out.println("SORTED:");
        /*
        for (KnapsackObject o : List) {
            System.out.println(" Weight:" + o.getWeight() + " Profits:" + o.getValue() + " Density:" +o.getDensity());
        }*/

        System.out.println("Enter the capacity of the knapsack:-");
        double capacity = sc.nextFloat();



        int curr_capacity = (int) (capacity * 100);
        int max_profit = 0;
        for (KnapsackObject o: List) {

            if(curr_capacity >= (int) (o.getWeight() * 100))
            {
                curr_capacity -= (int) (o.getWeight() * 100);
                max_profit += (int) (o.getValue() * 100);
            }
            else if(curr_capacity >= (int) (o.getDensity() * 100))
            {
                int curr_item = 0;
                while(curr_item < o.getWeight() && curr_capacity > 0)
                {
                    curr_item += (int) (o.getDensity() * 100);
                    curr_capacity -= (int) (o.getDensity() * 100);
                    max_profit += (int)(o.getDensity() * o.getValue() * 100);
                }
            }
            System.out.println(" Curr Capacity: " + curr_capacity + " Max Profit: " + max_profit);

            //Add parts of the item until it gets full

        }

        System.out.println("Max Profit: " + max_profit);
    }

}