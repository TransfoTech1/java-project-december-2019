package package3;

public class ConstructorTest {

    int zipcode;
    String state;

    public ConstructorTest() {

    }

    public ConstructorTest(int zip, String state) {
        this.zipcode = zip;
        this.state = state;
    }

    public ConstructorTest(int zip) {
        this.zipcode = zip;
    }


}
