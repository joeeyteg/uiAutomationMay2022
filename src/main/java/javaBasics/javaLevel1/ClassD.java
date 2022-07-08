package javaBasics.javaLevel1;

public class ClassD {
    //5 methods created below
    public int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public int multiplicationMethod(int x, int y) {
        return (x * y);
    }

    public int additionMethod(int x, int y) {
        return (x + y);
    }

    public int subtractionMethod(int x, int y) {
        return (x - y);
    }

    public int divisionMethod(int x, int y) {
        return (x / y);
    }

    public static void main(String[] args) {
        //instance of a class (creating an object) **ClassD classd = new ClassD();**
        ClassD classd = new ClassD();
        System.out.println(classd.max(5, 6));


        //methods using the object name **classd** called
        System.out.println("subtraction answer:" + classd.subtractionMethod(100, 25));
        System.out.println("division answer:" + classd.divisionMethod(100, 20));
        System.out.println("multiplication answer:" + classd.multiplicationMethod(20, 2));
        System.out.println("addition answer:" + classd.additionMethod(30, 15));

    }
}
