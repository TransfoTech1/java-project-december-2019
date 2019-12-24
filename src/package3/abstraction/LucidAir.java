package package3.abstraction;


public class LucidAir extends Ford {


    // method overriding -- same method name, same parameters
    // different class with connected through extend

    // dynamic polymorphism / runtime polymorphism


    public static void main(String[] args) {
        LucidAir lucidAir = new LucidAir();
        // lucidAir.brake();
        // lucidAir.start();
        lucidAir.wheels();
        //lucidAir.move();
    }

    @Override
    public void move() {
        System.out.println("lucid air has to move 200/mph");
    }

    @Override
    public void wheels() {
        System.out.println("lucid air will have no wheels ");
    }

    // -- create a business concept  -- interface
    // -- create that business's solid plan with some ideas and some implementation -- abstract class
    // -- create the business -- class
    // -- create a nextGen business  -- class

}
