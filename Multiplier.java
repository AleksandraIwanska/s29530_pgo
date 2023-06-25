import java.math.BigDecimal;

public class Multiplier {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c, int d) {
        return multiply(a, b) * multiply(c, d);
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();

        int result1 = multiplier.multiply(2, 3);
        System.out.println("Result 1: " + result1);

        int result2 = multiplier.multiply(2, 3, 4, 5);
        System.out.println("Result 2: " + result2);

        double result3 = multiplier.multiply(2.5, 1.5);
        System.out.println("Result 3: " + result3);

        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("2.5");
        BigDecimal result4 = multiplier.multiply(num1, num2);
        System.out.println("Result 4: " + result4);
    }
}