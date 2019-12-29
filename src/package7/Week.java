package package7;

public class Week {

    Day day;

    public Week(Day day) {
        this.day = day;
    }

    // switch   - (enum object){--switch body starts
    // case     - case takes the enum's value :
    //          - whatever is need to be done for that specific case
    // break    - to stop the execution there and get out from the enum block
    // default  - if anything not specified
    //}-- switch body ends

    public static void main(String[] args) {
        Week week = new Week(Day.Tuesday);
        week.whatToDo();
    }

    public void whatToDo() {
        switch (day) {
            case Monday:
                System.out.println("I'm going to TransfoTech");
                break;
            case Tuesday:
                System.out.println("I'm going to restaurent");
                break;
            case Wednesday:
                System.out.println("I'm going to relax at home");
                break;
            case Thursday:
            case Friday:
                System.out.println("I'll go to the gym");
                break;
            default:
                System.out.println("i'm going to movies");
                break;
        }

    }


}
