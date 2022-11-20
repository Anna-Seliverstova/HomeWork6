public class Fraction {
    public int numerator;
    public int denominator;

    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction add(Fraction other) {
        Fraction result = new Fraction(1, 1);
        if (this.denominator == other.denominator) {
            result.denominator = this.denominator;
            result.numerator = this.numerator + other.numerator;
        } else {
            int nok = nok(this.denominator, other.denominator);
            result.denominator = nok;
            result.numerator = this.numerator * (nok / this.denominator) + other.numerator * (nok / other.denominator);
        }
        return result;
    }

    public Fraction multiply(Fraction other) {
        Fraction result = new Fraction(1, 1);
        result.denominator = this.denominator * other.denominator;
        result.numerator = this.numerator * other.numerator;
        return result;
    }

    public Fraction division(Fraction other) {
        Fraction result = new Fraction(1, 1);
        result.denominator = this.denominator * other.numerator;
        result.numerator = this.numerator * other.denominator;
        return result;
    }

    private int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }

    private int nok(int a, int b) {
        return a / nod(a, b) * b;
    }
}

