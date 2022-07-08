package javaBasics.javaLevel1;

public class Task13_EnhancedSwitch {

        public static void main(String[] args) {
            System.out.println("What is today?");
            int dayNumber = 6;
            switch (dayNumber) {
                case 1 -> System.out.println("Sunday");
                case 2 -> System.out.println("Monday");
                case 3 -> System.out.println("Tuesday");
                case 4 -> System.out.println("Wednesday");
                case 5 -> System.out.println("Thursday");
                case 6 -> System.out.println("Friday");
                case 7 -> System.out.println("Saturday");
                default -> System.out.println("Please enter value between 1 and 7");
            }
        }

}
