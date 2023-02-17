public class KnapsackObject implements Comparable{
    private double weight;
    private double value;
    private final double density;

    @Override
    public int compareTo(Object o) {
        if (this.density == ((KnapsackObject) o).density){
            return 0;
        }
        if (this.density > ((KnapsackObject) o).density){
            return 1;
        }
        return -1;
    }

    KnapsackObject(double weight, double value){
        this.weight = weight;
        this. value = value;

        this.density = value / weight;

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