package package3;

public class Calculator {

    // diff btwn void & return
    // why parameterized methods

    //access-specifier (static)keyword datatypes method-name(){}


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //System.out.println(calculator.additionVoid(10,5)); -- wouldn't work -- bcz its void method
        calculator.additionVoid(10, 6);
        calculator.additionVoid(10, 7);
        int data1 = calculator.additionReturn(10, 5);
        int data2 = calculator.additionReturn(10, 6);

        System.out.println(data1 + data2);

        System.out.println(calculator.additionReturn(10, 7));

        int data4 = calculator.multiplicationReturn(10, 5);

    }

    public void additionVoid(int x, int y) {
        System.out.println(x + y);
    }

    public int additionReturn(int x, int y) {
        int z = x + y;
        System.out.println(z);
        return z;
    }

    public int multiplicationReturn(int x, int y) {
        int z = x * y;
        System.out.println(z);
        return z;
    }

}
