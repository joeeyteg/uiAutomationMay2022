package javaBasics.javaLevel1;

public class ClassI_Arrays {
    public static void main(String[] args) {


        String[] languages = {"Spanish", "English", "Russian", "Polish", "Portuguese", "Ososo language","Gaelic"};
//Calling from arrays
        System.out.println("Calling from the string arrays:");

        System.out.println(languages[5]);


        //Using traditional for loop to get all the arrays
        System.out.println("Getting all arrays:");
        for(int i = 0; i < 7; i++){
            System.out.println(languages[i]);
        }
        //using for-each
        System.out.println("Using for-each to get all arrays:");

        for(String t: languages){
            System.out.println(t);
        }
        System.out.println("Using for-each to get array length:");
        System.out.println(languages.length);

        // Array of integers
        System.out.println("Array of integers:");

        int[] myNumber = {5, 10, 15, 20, 25};
        for(int a: myNumber) {
            System.out.println(a);
        }



    }

}
