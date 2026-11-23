public class Gold extends FixedAsset {
    private double ounces;

    // Constructor
    public Gold(String name, double marketValue, double ounces) {
        // Calling parent constructor
        super(name, marketValue);
        this.ounces = ounces;
    }
    public double getOunces() {
        return ounces;
    }

    @Override
    public double getValue() {
        return getMarketValuable();
    }
}
