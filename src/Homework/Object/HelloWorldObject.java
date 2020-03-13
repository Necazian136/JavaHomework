package Homework.Object;

import Homework.Exception.HelloWorldException;

/**
 * Объект над которым совершаются действия
 */
public class HelloWorldObject {

    /**
     * Выводит Hello world!
     */
    public void doSomeThink() {
        System.out.print("Hello world!");
    }

    /**
     *
     * @throws HelloWorldException всегда выбрасывет HelloWorldException
     */
    public void throwException() throws HelloWorldException {
        throw new HelloWorldException();
    }
}
