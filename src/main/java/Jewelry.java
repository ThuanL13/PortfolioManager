import java.math.BigDecimal;

public class Jewelry extends FixedAsset {
    private String material;

    public Jewelry(String name, BigDecimal marketValue, String material) {
        super(name, marketValue);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public BigDecimal getValue() {
        return getMarketValue();
    }
}
