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

        for (KnapsackObject o : List) {
            System.out.println(" Weight:" + o.getWeight() + " Profits:" + o.getValue() + " Density:" +o.getDensity());
        }
    }

}