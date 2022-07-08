package javaBasics.javaLevel1;

public class TestPlay_javaContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i == 4) {
                continue;
            }
            if (i == 8) {
                continue;
            }
            if (i == 12) {
                continue;
            }
            if (i == 19) {
                break;
            }
            System.out.println(i);
        }
    }
}
