import java.math.BigDecimal;

public abstract class FixedAsset implements Valuable {
    private String name;
    private BigDecimal marketValue;

    // Constructor for child classes
    public FixedAsset(String name, BigDecimal marketValuable) {
        this.name = name;
        this.marketValue = marketValue;
    }
    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
    }
}
