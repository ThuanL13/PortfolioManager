public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValuable;

    // Constructor for child classes
    public FixedAsset(String name, double marketValuable) {
        this.name = name;
        this.marketValuable = marketValuable;
    }
    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketValuable() {
        return marketValuable;
    }

    public void setMarketValuable(double marketValuable) {
        this.marketValuable = marketValuable;
    }
}
