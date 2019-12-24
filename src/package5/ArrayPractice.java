package package5;

public class ArrayPractice {

    public static void main(String[] args) {
        // goal ----> String name = "A","B","C","D";

        String[] names = {"A", "B", "C", "D"};

        int[] numbers = {341, 32, 34, 14, 54};

       /* System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);*/
        // run a loop which starts at 0, and runs till the length of the array
        // use the method called names.length to get the size of the array
        // so if you add a new value in the array you don't have the change the loop again

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        Object[] everythingArray = {"AB", 12, true, 33f};


        System.out.println(everythingArray[2]);

        for (int x = 0; x < everythingArray.length; x++) {
            System.out.println(everythingArray[x]);
        }

        //Dynamic Array
        String[] countries = new String[10];

        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "Brazil";
        countries[3] = "Bangladesh";


        System.out.println(countries[4]);
        System.out.println(countries[2]);

        System.out.println(countries.length);


        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }

        String[] countries2 = countries.clone();


        System.out.println(countries2[3]);
        System.out.println(countries2.length);


    }

}
