package package2;

public class TestMethods {
    public static void main(String[] args) {
        int variableName = MethodTypes.method4();
        System.out.println(MethodTypes.name);

        MethodTypes methodTypes = new MethodTypes();
        methodTypes.method3();
        System.out.println(methodTypes.year);

        methodTypes.testMethod11();
    }
}
