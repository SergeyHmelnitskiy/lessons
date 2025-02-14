package lesson13testNG;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class FactorialTestNG {

    @Test(description = "Проверка вычисления факториала 0")
    public void testFactorialOfZero() {
        assertEquals(Factorial.calculateFactorial("0"), 1);
    }

    @Test(description = "Проверка вычисления факториала 1")
    public void testFactorialOfNumberOne() {
        assertEquals(Factorial.calculateFactorial("1"), 1);
    }

    @Test(description = "Проверка вычисления факториала 5")
    public void testFactorialOfNormalNumber() {
        assertEquals(Factorial.calculateFactorial("5"), 120);
    }

    @Test(description = "Проверка вычисления факториала на отрицательное число")
    public void testFactorialOfNegativeNumber() {
        try {
            Factorial.calculateFactorial("-1");
            fail("Возможное исключение");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Число не может быть отрицательным.");
        }
    }

    @Test(description = "Проверка вычисления факториала максимального числа которое можно получить для типа long")
    public void testFactorialOfMaxLong() {
        assertEquals(Factorial.calculateFactorial("20"), 2432902008176640000L);
    }

    @Test(description = "Проверка, что передано именно число")
    public void testFactorialOfNoStringNumber() {
        try {
            Factorial.calculateFactorial("число");
            fail("Возможное исключение");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Введенное значение должно быть целым числом.");
        }
    }

    @Test(description = "Проверка, что передано целое число")
    public void testFactorialOfNoDoubleNumber() {
        try {
            Factorial.calculateFactorial("0.5");
            fail("Возможное исключение");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Введенное значение должно быть целым числом.");
        }
    }
}
