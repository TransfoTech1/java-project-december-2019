package package3.abstraction;

public class Ford extends Car implements Vehicle, Vehicle2 {

    // from abstract class to bring all the methods :
    // you have to extend the class and implement all the methods

    // from interface to bring all the methods :
    // you have to implement the interface and all its methods

    //always extend first, then implement
    // can imply multiple interfaces
    // can not extend multiple class/abstract class


    @Override
    public void wheels() {
        System.out.println("Ford has 4 wheels");
    }

    @Override
    public void move() {
        System.out.println("Ford is moving");
    }

    @Override
    public void start() {
        System.out.println("Ford has started");
    }

    @Override
    public void stop() {
        System.out.println("Ford has stopped");
    }
}
