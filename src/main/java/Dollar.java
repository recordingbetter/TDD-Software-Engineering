public class Dollar {
    public int amount = 0;
    public Dollar(int dollar) {
        amount = dollar;
    }
    public void times(int multiplier) {
        amount = amount * multiplier;
    }
}
