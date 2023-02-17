import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of objects:- ");
        int count = sc.nextInt();

        ArrayList<obj> List = new ArrayList<>();
        System.out.println("Enter the weights and profits of each object:");
        for(int i = 0; i < count; i++){
            obj object = new obj(i, sc.nextDouble(), sc.nextDouble());
            List.add(object);
        }

        for (obj o : List) {
            System.out.println("Item:" + o.getItem() + " Weight:" + o.getWeight() + " Profits:" + o.getValue() + " Density:" +o.getDensity());
        }


        //Sort the objects descending
        List.sort(obj::compareTo);

        System.out.println("SORTED:");
        for (obj o : List) {
            System.out.println("Item:" + o.getItem() + " Weight:" + o.getWeight() + " Profits:" + o.getValue() + " Density:" +o.getDensity());
        }
    }

}