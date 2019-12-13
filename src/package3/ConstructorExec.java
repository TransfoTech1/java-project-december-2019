package package3;

public class ConstructorExec {

    public static void main(String[] args) {
        ConstructorTest constructorTest1 = new ConstructorTest();
        ConstructorTest constructorTest2 = new ConstructorTest(11374, "NY");
        ConstructorTest constructorTest3 = new ConstructorTest(111224);
        System.out.println(constructorTest1.state);
        System.out.println(constructorTest2.state);
        System.out.println(constructorTest2.zipcode);
        System.out.println(constructorTest3.zipcode);
        System.out.println(constructorTest3.state);
    }
}
