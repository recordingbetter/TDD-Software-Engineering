public class Dollar {
    public int original;
    public int amount = 10;
    // 생성자
    public Dollar(int dollar) {
        original = dollar;
        amount = dollar;
    }
    // 함수
    public Dollar times(int multiplier) {
        // amount = amount * multiplier;
        amount = original * multiplier;
        return new Dollar(amount);
    }
    // equals 함수 오버라이드
    public boolean equals(Dollar dollar) {
        return (amount == dollar.amount);
    }
}
