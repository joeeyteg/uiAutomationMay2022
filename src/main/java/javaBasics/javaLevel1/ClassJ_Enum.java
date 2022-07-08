package javaBasics.javaLevel1;

public class ClassJ_Enum {
    enum PhoneType{ Motorola, Nokia, Samsung, HTC, Redmi, OPPO}
//when assigned as enum java can call it when assignment name is used
public static void main(String[] args) {

    System.out.println(PhoneType.Redmi);
    System.out.println(PhoneType.Nokia);

}

}
