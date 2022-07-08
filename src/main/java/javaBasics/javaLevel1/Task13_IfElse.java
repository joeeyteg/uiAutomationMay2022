package javaBasics.javaLevel1;

public class Task13_IfElse {


    public static void main(String[] args) {
        System.out.println("What is day is it today?");
        int dayNumber = 6;

        if (dayNumber == 1) {
            System.out.println("Sunday");
        } else if (dayNumber == 2) {
            System.out.println("Monday");
        } else if (dayNumber == 3) {
            System.out.println("Tuesday");
        } else if (dayNumber == 4) {
            System.out.println("Wednesday");
        } else if (dayNumber == 5) {
            System.out.println("Thursday");
        } else if (dayNumber == 6) {
            System.out.println("Friday");
        } else if (dayNumber == 7) {
            System.out.println("Saturday");
        } else {

            System.out.println("Please enter value between 1-7");
        }
    }
}

