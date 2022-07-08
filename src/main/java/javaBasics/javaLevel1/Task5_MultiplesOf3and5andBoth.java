package javaBasics.javaLevel1;

public class Task5_MultiplesOf3and5andBoth {
    public static void main(String[] args) {

        System.out.println("Replace the multiples of 3,5,and both with multiple of three, multiple of five, and multiple of three and five respectively:");

        for (int m = 1; m <= 100; m++) {

            if (m % 15 == 0) {
                System.out.println("multiple of three and five");
            } else if (m % 5 == 0) {
                System.out.println("multiple of five");
            } else if (m % 3 == 0) {
                System.out.println("multiple of three");
            } else
                System.out.println(m);
        }

    }
}





