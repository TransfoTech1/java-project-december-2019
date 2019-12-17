package package4;

public class ConditionalForLoop {

    public static void main(String[] args) {

        // for the first 5 i .. print i hate java
        // for the second 5 i .. print i love java

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                System.out.println("i hate java" + i);
            } else if (i > 5) {
                System.out.println("I love java" + i);
            } else
                System.out.println("i dont care about java" + i);
        }
    }
}
