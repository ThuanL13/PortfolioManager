import java.math.BigDecimal;

public class Gold extends FixedAsset {
    private double ounces;

    // Constructor
    public Gold(String name, BigDecimal marketValue, double ounces) {
        // Calling parent constructor
        super(name, marketValue);
        this.ounces = ounces;
    }
    public double getOunces() {
        return ounces;
    }

    @Override
    public BigDecimal getValue() {
        return getMarketValue();
    }
}
