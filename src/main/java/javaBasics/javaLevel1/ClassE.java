package javaBasics.javaLevel1;

public class ClassE {


    public static void main(String[] args) {
//running method using defined object **classdObject** from object below
        ClassD classdObject = new ClassD();
        System.out.println(classdObject.max(4, 7));
        System.out.println("subtraction answer:" + classdObject.subtractionMethod(100, 25));
        System.out.println("division answer:" + classdObject.divisionMethod(100, 20));
        System.out.println("multiplication answer:" + classdObject.multiplicationMethod(20, 2));
        System.out.println("addition answer:" + classdObject.additionMethod(30, 15));

    }  }