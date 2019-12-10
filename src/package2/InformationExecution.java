package package2;

public class InformationExecution {

    // count your {, ( --- how many opened,how many closed
    // syntax -- upper case, lower case, unwanted spaces
    //

    public static void main(String[] args) {

        // class-name refferrenceVariable/object = new(keyword) constructorName();
        Information information = new Information();
        Information information2 = new Information("Akash");
        Information information3 = new Information("Zann");
        Information information4 = new Information(233424);
        Information information5 = new Information(12, "Ron");

        information.testMethod();
        information.testMethod2();
        System.out.println(information.state);

        System.out.println(information.name);
        System.out.println(information2.name);
        System.out.println(information3.name);
        System.out.println(information4.id);
        System.out.println(information3.id);


        System.out.println(information5.id);
        System.out.println(information5.name);
    }
}
