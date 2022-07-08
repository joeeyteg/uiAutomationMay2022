package javaBasics.javaLevel1;

//Specify array list below with
import java.util.ArrayList;
//statement above

public class ClassM_ArrayList {

    public static void main(String[] args) {
        System.out.println("List of some countries:");
        ArrayList<String> countries = new ArrayList<>();
        countries.add("England");
        countries.add("Poland");
        countries.add("France");
        countries.add("Portugal");
        countries.add("Nigeria");
        countries.add("Scotland");
        countries.add("Greece");
        countries.add("Wales");
        countries.add("Northern Ireland");
        countries.add("Iceland");
        countries.forEach((n) -> {
            System.out.println(n);
        });

    }
}
