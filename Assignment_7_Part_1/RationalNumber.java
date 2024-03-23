package Assignment_7.Assignment_7_Part_1;

class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber add(RationalNumber other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber subtract(RationalNumber other) {
        int num = this.numerator * other.denominator - other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber multiply(RationalNumber other) {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber divide(RationalNumber other) {
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new RationalNumber(num, den);
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public RationalNumber abs() {
        return new RationalNumber(Math.abs(numerator), Math.abs(denominator));
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
