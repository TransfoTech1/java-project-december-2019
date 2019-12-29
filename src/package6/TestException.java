package package6;

public class TestException {


    public static void main(String[] args) {

        String[] names = {"Mr X", "Mr Y", "Mr Z"};

        try {
            System.out.println(names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index is more than actual . please try again");
        }
    }
}
