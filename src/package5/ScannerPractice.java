package package5;

import java.util.Scanner;

public class ScannerPractice {

    // your program should ask the user to inject 5 of the state names
    // store the names into an array
    // read all the names from the array and store into an array list
    // then print all the values from the arrayList using a for loop


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name : ");
        String firstName = scanner.next();

        System.out.println("enter last name : ");
        String lastName = scanner.next();

        System.out.println("enter the year");
        int year = scanner.nextInt();

        System.out.println("full name is : " + lastName + " " + firstName);
        System.out.println("year is " + year);

    }


}
