package package3.abstraction;


public class LucidAir extends Ford {

    public static void main(String[] args) {
        LucidAir lucidAir = new LucidAir();
        lucidAir.brake();
        lucidAir.start();
        lucidAir.wheels();
        lucidAir.move();
    }

    @Override
    public void move() {
        System.out.println("lucid air has to move 200/mph");
    }

    // -- create a business concept  -- interface
    // -- create that business's solid plan with some ideas and some implementation -- abstract class
    // -- create the business -- class
    // -- create a nextGen business  -- class

}
