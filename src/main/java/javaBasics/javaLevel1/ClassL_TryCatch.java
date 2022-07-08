package javaBasics.javaLevel1;

public class ClassL_TryCatch {
    public static void main(String[] args) {

        String[] languages = {"Spanish", "English", "Ososo language", "Polish", "Portuguese"};

        System.out.println(languages[4]);
        //To catch the known exception below
        try{
            System.out.println(languages[9]);
        } catch(Exception E){
            System.out.println("Exception being detected is:" + E);
        }
        //Exception above caught
        System.out.println(languages[2]);


    }
}

