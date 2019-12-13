package package3.encapsulation;

public class StudentExecution {

    public static void main(String[] args) {

        // setup data using 3 students and get the data

        Student akash = new Student();
        akash.setFirstName("Akash");
        akash.setLastName("Ghosh");
        akash.setId(334);

        String firstNameFromGetter = akash.getFirstName();
        System.out.println(firstNameFromGetter);
        System.out.println(akash.getLastName());
        System.out.println(akash.getId());

        Student X = new Student();
        String fName = X.getFirstName();
        System.out.println(fName);
    }
}
