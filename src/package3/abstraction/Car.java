package package3.abstraction;

public abstract class Car {

    // solid plan + some ideas = abstract class
    // can have method with body + method without body
    // has constructor but still can not create the object

    public Car() {

    }

    public void brake() {
        System.out.println("car should have brake");
    }

    public abstract void wheels();


}
