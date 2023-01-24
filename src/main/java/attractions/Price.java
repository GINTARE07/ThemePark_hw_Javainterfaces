package attractions;

public enum Price {
    ROLLERCOASTER(8.40),
    DODGEMS(4.50);

    private final double price;

    Price(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
