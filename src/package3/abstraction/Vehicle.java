package package3.abstraction;

public interface Vehicle extends Vehicle3 {

    // concept = interface
    // can have method without body
    // execute of plan = regular class
    // interface doesn't has a constructor -- can not create object

    public void move();

    public void start();

    public void stop();


}
