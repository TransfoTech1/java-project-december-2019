package package5;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerHomeWork {

    // your program should ask the user to inject 5 of the state names
    // store the names into an array
    // read all the names from the array and store into an array list
    // then print all the values from the arrayList using a for loop


    public static void main(String[] args) {

        String[] stateArray = new String[5];
        ArrayList<String> stateList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 5 states name : ");
        for (int i = 0; i < stateArray.length; i++) {
            stateArray[i] = scanner.next();
        }

        System.out.println("print from array ");
        for (int x = 0; x < stateArray.length; x++) {
            System.out.print(stateArray[x] + " ");
        }

        System.out.println();
        for (int x = 0; x < stateArray.length; x++) {
            stateList.add(stateArray[x]);
        }
        System.out.println("print from list " + stateList);


    }


}
