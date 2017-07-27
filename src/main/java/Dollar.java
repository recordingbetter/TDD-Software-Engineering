public class Dollar {
    public int original;
    public int amount = 10;
    public Dollar(int dollar) {
        original = dollar;
        amount = dollar;
    }
    public void times(int multiplier) {
        // amount = amount * multiplier;
        amount = original * multiplier;
    }
}
