package javaBasics.javaLevel1;

public class ClassC {
    //    Boolean logic; Y or N, True or False
    public static void main(String[] args) {
        int X = 6;
//    Logical AND returns true if all conditions is satisfied in statement
        System.out.println(X > 10 && X > 15);
        System.out.println(X > 10 && X < 15);

        int Y = 7;
        //    Logical OR returns true if any condition is satisfied in statement
        System.out.println("OR:" + (Y > 10 || Y > 15));

        int Z = 7;
//  Logical NOR returns opposite of OR (like a reverse OR)
        System.out.println("NOT:"+ !(Z > 10 || Z > 15));

    }

}
