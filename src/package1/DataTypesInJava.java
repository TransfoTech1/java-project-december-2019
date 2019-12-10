package package1;

public class DataTypesInJava {

    String location = "NY";

    public static void main(String[] args) {
        // use each data types 10 times and print them accordingly

        String name = "Akash";
        String accNum = "26_342_634";

        // int lowest -2_147_483_648  : 32bit
        // int heighest 2_147_483_647
        int accountNumber = 2_147_483_647;
        int year = 1990;

        // boolean - true /false
        boolean flag = false;

        // char - https://en.wikipedia.org/wiki/List_of_Unicode_characters
        // paste the unicode, start with backslash , replace uppercase U with lowercase u
        // and remove + sign, and resides inside the single quote
        //U+00A9
        char singleChar = '\u00A9';


        //8 bit
        byte number1 = -128;
        byte number2 = 127;

        //16 bit
        short number3 = -32_768;
        short number4 = 32_767;

        //32 bit - specify with f at the end
        float number5 = 2_147_483_647f;

        //64 bit
        long number6 = 2453454234234234l;

        //64 bit
        double number7 = 11.2334d;

        System.out.println(singleChar);
        System.out.println(accNum);
        System.out.println(accountNumber);
        System.out.println(flag);
        System.out.println(name);
        System.out.println(year);

    }
}
