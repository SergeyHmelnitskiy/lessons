package lesson13junit5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTestJunit5 {
    @Test
    @DisplayName("Проверка вычисления факториала 0")
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.calculateFactorial("0"));
    }

    @Test
    @DisplayName("Проверка вычисления факториала 0")
    public void testFactorialOfNumberOne() {
        assertEquals(1, Factorial.calculateFactorial("1"));
    }

    @Test
    @DisplayName("Проверка вычисления факториала 5")
    public void testFactorialOfNormalNumber() {
        assertEquals(120, Factorial.calculateFactorial("5"));
    }

    @Test
    @DisplayName("Проверка вычисления факториала на отрицательное число")
    public void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial("-1");
        });
        assertEquals("Число не может быть отрицательным.", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка вычисления факториала максимального числа которое можно получить для типа long")
    public void testFactorialOfMaxLong() {
        assertEquals(2432902008176640000L, Factorial.calculateFactorial("20"));
    }

    @Test
    @DisplayName("Проверка, что передано именно число")
    public void testFactorialOfNoStringNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial("число");
        });
        assertEquals("Введенное значение должно быть целым числом.", exception.getMessage());
    }
    @Test
    @DisplayName("Проверка, что передано целое число")
    public void testFactorialOfNoDoubleNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial("0.5");
        });
        assertEquals("Введенное значение должно быть целым числом.", exception.getMessage());
    }
}
