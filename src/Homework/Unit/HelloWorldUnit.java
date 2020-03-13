package Homework.Unit;
import Homework.Object.HelloWorldObject;

/**
 * Объект который совершает действия над объектом HelloWorldObject
 */
public class HelloWorldUnit {
    private HelloWorldObject helloWorld;

    /**
     * @param obj HelloWorldObject
     */
    public HelloWorldUnit(HelloWorldObject obj) {
        this.helloWorld = obj;
    }

    /**
     * @throws NullPointerException Если передан в конструкторе null, то выбросится это исключение
     */
    public void callHelloWorldObject() throws NullPointerException {
        this.helloWorld.doSomeThink();
    }
}
