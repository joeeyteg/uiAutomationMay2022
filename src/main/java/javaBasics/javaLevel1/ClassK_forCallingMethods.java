package javaBasics.javaLevel1;

public class ClassK_forCallingMethods {

    public static void main(String[] args) {

        //calling a method using object of class

ClassF_IfElse classF_ifElse = new ClassF_IfElse();
        System.out.println(classF_ifElse.DisplayMonthName(1));


        //calling a static method (object of class not required)

        System.out.println(ClassG_Switch.getMonthName(5));
    }
}
