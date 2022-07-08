package javaBasics.javaLevel1;

public class Task13_Switch {
    public static void main(String[] args) {
        System.out.println("What is today?");
        int dayNumber = 6;
        switch (dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Please enter value between 1 and 7");
        }
    }

}
