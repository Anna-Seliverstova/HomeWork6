public class FractionOutput {
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(2, 3);
        Fraction frac2 = new Fraction(1, 5);
        System.out.println("First fraction: " + frac1 + ", Second fraction: " + frac2);

        Fraction sum = frac1.add(frac2);
        System.out.println(frac1 + " + " + frac2 + " = " + sum);

        Fraction mult = frac1.multiply(frac2);
        System.out.println(frac1 + " * " + frac2 + " = " + mult);

        Fraction div = frac1.division(frac2);
        System.out.println(frac1 + " / " + frac2 + " = " + div);
    }
}
