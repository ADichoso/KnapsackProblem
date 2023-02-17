public class KnapsackObject {
    private float weight;
    private float profit;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public KnapsackObject(float weight, float profit) {
        this.weight = weight;
        this.profit = profit;
    }
}
