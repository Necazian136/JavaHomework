package Homework1.Test;

import Homework1.Service.SquareRootService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Задание 2. Составить программу, генерирующую N случайных чисел. Для каждого числа k вычислить квадратный корень q.
 * Если квадрат целой части q числа равен k, то вывести это число на экран.
 * Предусмотреть что первоначальные числа могут быть отрицательные, в этом случае генерировать исключение.
 */
public class SquareRootTest {
    @Test
    public void negativeNumbersTest() {
        boolean result = true;
        try {
            SquareRootService srs = new SquareRootService();
            for (Integer i : srs.getRightNumbers(100, -100, -1)) {
                System.out.println(i);
            }
        } catch (Exception exception) {
            result = false;
            System.out.println(exception.getMessage());
        }
        Assert.assertFalse(result);
    }

    @Test
    public void test() {
        boolean result = true;
        try {
            SquareRootService srs = new SquareRootService();
            for (Integer i : srs.getRightNumbers(100, 0, 100)) {
                System.out.println(i);
            }
        } catch (Exception exception) {
            result = false;
            System.out.println(exception.getMessage());
        }
        Assert.assertTrue(result);
    }
}
