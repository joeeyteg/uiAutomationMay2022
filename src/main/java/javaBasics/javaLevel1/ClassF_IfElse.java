package javaBasics.javaLevel1;

public class ClassF_IfElse {
//written method to be used as below
    public String DisplayMonthName(int monthNumber) {
//written block of code
        if (monthNumber == 1) {
            return ("January");
        } else if (monthNumber == 2) {
            return ("February");
        } else if (monthNumber == 3) {
            return ("March");
        } else if (monthNumber == 4) {
            return ("April");
        } else if (monthNumber == 5) {
            return ("May");
        } else if (monthNumber == 6) {
            return ("June");
        } else if (monthNumber == 7) {
            return ("July");
        } else if (monthNumber == 8) {
            return ("August");
        } else if (monthNumber == 9) {
            return ("September");
        } else if (monthNumber == 10) {
            return ("October");
        } else if (monthNumber == 11) {
            return ("November");
        } else if (monthNumber == 12) {
            return ("December");
        } else {
            return ("Enter value between 1 and 12");
        }

    }

    public static void main(String[] args) {
        //creating instance of a CLASS to create an object "CLASSf_ifelse"
ClassF_IfElse CLASSf_ifelse = new ClassF_IfElse();
        System.out.println(CLASSf_ifelse.DisplayMonthName(5));

    }
}
