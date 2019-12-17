package package4;

public class Conditions {

    public static void main(String[] args) {

        // if
        // else if
        // else

        // if  body gets executed only when the condition is true
        // == - is
        // != - is not
        // || - or - any conditions can be true and if block gets executed
        // && - and - both conditions has to be true
        // for string = equals,. equalIgnoreCase : depending on requirement


        int year = 2020;
        if (year == 2019) { // --- if the value of year is equal to 2019
            System.out.println("I'm X years old ");
        } else if (year == 2020) {
            System.out.println("I'm Y years old");
        } else
            System.out.println("I dont care the year ");

        int i = 10;
        if (i != 10) {
            System.out.println("I are not same");
        }

        String companyName = "TransfoTech";
        String myCompanyName = "Transftech";

        if (!companyName.equalsIgnoreCase(myCompanyName)) {
            System.out.println("Companies are not equal");
        }


        String state = "NY";

        if (state == "NY" || state == "AZ") {
            System.out.println("i hate traffic ");
        } else System.out.println("i love my state");


        int number = 19;
        if (number == 20 && number > 17) {
            System.out.println("Its my lucky number");
        } else {
            System.out.println("unlucky number");
        }


    }
}
