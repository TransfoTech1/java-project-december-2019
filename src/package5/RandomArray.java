package package5;

import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random random = new Random();

        numbers[0] = 22;
        numbers[1] = 25;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }


    }

}
