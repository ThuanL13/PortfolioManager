import java.math.BigDecimal;

public class House extends FixedAsset {
    private String address;

    // Constructor
    public House(String name, BigDecimal marketValue, String address) {
        super(name, marketValue);
        this.address = address;
    }
    // Returning address
    public String getAddress() {
        return address;
    }

    @Override
    public BigDecimal getValue() {
        return getMarketValue();
    }
}
