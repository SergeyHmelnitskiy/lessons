package lesson13junit5;

public class Factorial {
    public static long calculateFactorial(String input) {
        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Введенное значение должно быть целым числом.");
        }
        if (number < 0) throw new IllegalArgumentException("Число не может быть отрицательным.");
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
