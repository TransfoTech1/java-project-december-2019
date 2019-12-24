package package5;

public class Calculator {

    // method overloading - same method name, different parameters
    // known as static polymorphism/ compile time polymorphism

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition();
        calculator.addition(10, 20);

        calculator.addition(10, 20, 30);
    }

    public void addition(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    public void addition() {
        System.out.println("no parameters addition");
    }
}
