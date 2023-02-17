public class obj implements Comparable{
    private int item;
    private double weight;
    private double value;
    private final double density;

    @Override
    public int compareTo(Object o) {
        if (this.density == ((obj) o).density){
            return 0;
        }
        if (this.density > ((obj) o).density){
            return 1;
        }
        return -1;
    }

    obj(int item, double weight, double value){
        this.item = item;
        this.weight = weight;
        this. value = value;

        this.density = value / weight;

    }

    public int getItem() {
        return item;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    public double getDensity() {
        return density;
    }
}