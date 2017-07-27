public class Franc {
    public int original;
    public int amount = 10;
    // 생성자
    public Franc(int franc) {
        original = franc;
        amount = franc;
    }
    // 함수
    public Franc times(int multiplier) {
        amount = original * multiplier;
        return new Franc(amount);
    }
    // equals 함수 오버라이드
    public boolean equals(Franc franc) {
        return (amount == franc.amount);
    }
}
