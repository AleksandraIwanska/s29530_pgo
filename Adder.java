import java.math.BigDecimal;
import java.util.List;

public class Adder {
    public int add(int a, int b) {
        return a + b;
    }

    public BigDecimal add(List<BigDecimal> numbers) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal number : numbers) {
            sum = sum.add(number);
        }
        return sum;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();

        int result1 = adder.add(2, 3);
        System.out.println("Result 1: " + result1);

        List<BigDecimal> numbers = List.of(
                new BigDecimal("10.5"),
                new BigDecimal("2.5"),
                new BigDecimal("7.0")
        );
        BigDecimal result2 = adder.add(numbers);
        System.out.println("Result 2: " + result2);
    }
}