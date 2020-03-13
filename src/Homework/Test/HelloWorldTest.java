package Homework.Test;

import org.junit.Assert;
import org.junit.Test;
import Homework.Unit.HelloWorldUnit;
import Homework.Object.HelloWorldObject;
import Homework.Exception.HelloWorldException;

/**
 * Задание 1. Написать программу ”Hello, World!”. В ходе выполнения программы она должна
 * выбросить исключение и завершиться с ошибкой.
 * * Смоделировав ошибку «NullPointerException»
 * * Смоделировав ошибку «ArrayIndexOutOfBoundsException»
 * * Вызвав свой вариант ошибки через оператор throw
 */
public class HelloWorldTest {
    @Test
    public void nullPointerExceptionTest() {
        boolean result = false;
        try {
            HelloWorldUnit unit = new HelloWorldUnit(null);
            unit.callHelloWorldObject();
        } catch (NullPointerException exception) {
            result = true;
        }
        Assert.assertTrue(result);
    }


    @SuppressWarnings({"MismatchedReadAndWriteOfArray", "ConstantConditions"})
    @Test
    public void arrayIndexOutOfBoundsExceptionTest() {
        boolean result = false;
        try {
            HelloWorldObject[] objs = new HelloWorldObject[3];
            objs[3].doSomeThink();
        } catch (IndexOutOfBoundsException exception) {
            result = true;
        }
        Assert.assertTrue(result);
    }

    @Test
    public void helloWorldExceptionTest() {
        boolean result = false;
        try {
            HelloWorldObject obj = new HelloWorldObject();
            obj.throwException();
        } catch (HelloWorldException exception) {
            result = true;
        }
        Assert.assertTrue(result);
    }
}
