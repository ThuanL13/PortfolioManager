import java.math.BigDecimal;
import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner, ArrayList<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }
    // Adds to portfolio
    public void add(Valuable asset) {
        assets.add(asset);
    }
    // Total value
    public BigDecimal getValue() {
        BigDecimal total = BigDecimal.ZERO;
        for (Valuable asset : assets) {
            total = total.add(asset.getValue());
        }
        return total;
    }
    // Most valuable
    public Valuable getMostValuable() {
        if (assets.isEmpty()) {
            return null;
        }
        Valuable mostValuable = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue().compareTo(mostValuable.getValue()) > 0) {
                mostValuable = asset;
            }
        }
        return mostValuable;
    }
}
