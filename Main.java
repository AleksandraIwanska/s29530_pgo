import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        fillArray(array);

        System.out.println("Array values:");
        for (int value : array) {
            System.out.println(value);
        }
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                array[i] = 0;
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}