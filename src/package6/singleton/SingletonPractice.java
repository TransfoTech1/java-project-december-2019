package package6.singleton;

public class SingletonPractice {

    // private static object of the class -- half way
    private static SingletonPractice singletonPractice;

    // private default constructor of the class that we are trying to make singleton
    private SingletonPractice() {

    }

    // a public static return type method of the class's object
    // which creates and return the object of the class
    public static SingletonPractice getSingletonPractice() {
        if (singletonPractice == null) {
            singletonPractice = new SingletonPractice();
        }
        return singletonPractice;
    }

    public void printState() {
        System.out.println("NY");
    }

}
