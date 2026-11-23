public class Jewelry extends FixedAsset {
    private String material;

    public Jewelry(String name, double marketValue, String material) {
        super(name, marketValue);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public double getValue() {
        return getMarketValuable();
    }
}
