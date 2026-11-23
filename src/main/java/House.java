public class House extends FixedAsset {
    private String address;

    // Constructor
    public House(String name, double marketValue, String address) {
        super(name, marketValue);
        this.address = address;
    }
    // Returning address
    public String getAddress() {
        return address;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
