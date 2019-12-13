package package2;

public class MethodTypes {

    public static String name = "Transfotech";
    public int year = 2010;

    public static void method2() {
        System.out.println("My Name from Void Method");
        System.out.println("whatever you want");
    }

    //Access Specifiers :
    // 1. public : starts with public -- public String location = "Queens";
    // 2. private : starts with private -- private String location = "Queens";
    // 3. default : doesn't specifies anything -- String location = "Queens";
    // 4. protected : starts with protected -- protected String location = "Queens";

    // void methods

    // access-specifier   staticVSnon-static   what-type-of-method (void or return ,if return - specify what datatype to return)
    // method-name     (method-parameters) {- method body starts
    // method body -- whatever we want to do
    // } -- method body ends

    public static void main(String[] args) {
        method2();
        MethodTypes methodTypes = new MethodTypes();
        String returnedvalue = methodTypes.method3();
        System.out.println(returnedvalue);
        int variableName = method4();
        System.out.println(variableName);
    }

    public static int method4() {
        return 10;
    }

    // return type methods

    public void testMethod11() {
        String id = "NY_23425";
    }

    //access-specifier (static)keyword datatypes method-name(){}
    public String method3() {
        System.out.println("what ever");
        return "My Name From Return Type Method";
    }


}
