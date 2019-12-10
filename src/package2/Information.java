package package2;

public class Information {
    // class level variables
    String location = "Queens";
    int year = 2019;
    String state = "NY";
    String name;
    int id;

    //default constructor
    // -- same name as class name & no void or return type
    public Information() {

    }

    // parameterized constructor
    //Information information = new Information("Akash");
    public Information(String nameForConstructor) {
        this.name = nameForConstructor;
    }

    public Information(int idForConstructor) {
        this.id = idForConstructor;
    }

    public Information(int idForConstructor, String name) {
        this.id = idForConstructor;
        this.name = name;
    }


    public int getYear() {
        return 2018;
    }

    public void testMethod() {
        System.out.println("from test method " + location);
        System.out.println(year);
    }

    public void testMethod2() {
        System.out.println("from test method2 " + location);
    }

}


