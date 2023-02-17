import java.util.ArrayList;
import java.util.Scanner;


public class AlgoTest {
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
        double capacity = sc.nextDouble();
        double profit = 0;

        for (KnapsackObject o: List){
            if(capacity > o.getWeight()){
                capacity -= o.getWeight();
                profit += o.getValue();
            }else{
                profit += (o.getDensity() * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Max Profit: " + profit);
        System.out.println("Remaining capacity:" + capacity);

        /* Sample input and output
            Enter the no. of objects:- 6
            Enter the weights and profits of each object:
            6 6 10 2 3 1 5 8 1 3 3 5
            SORTED:
            Enter the capacity of the knapsack:-
            16
            Max Profit: 22.333333333333332
           Remaining capacity:0.0
         */
    }

}