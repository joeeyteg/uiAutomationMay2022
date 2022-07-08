package javaBasics.javaLevel1;

public class TestPlay_javaBreak {

    public static void main(String[] args) {
        //break when the "if" is met
        for (int x = 0; x < 10; x++) {
            if (x == 6) {
                break;
            }
            System.out.println(x);
        }
    }
}
