package Sonstiges;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Aufgabe {

    public static void main(String[] args) {
        ArrayList<String> myString = new ArrayList<>();
        myString.add("Anna");
        myString.add("Awat");
        myString.add("Peter");
        myString.add("Aaron");

        System.out.println("Die Liste: "+ myString);

        Predicate<String> startsWithA=s -> s.startsWith("A");

        List<String> ListeA=new ArrayList<>();
        List<String> ListeNichtA=new ArrayList<>();
        for (String s : myString) {
            if (startsWithA.test(s)) {
                ListeA.add(s);
            } else {
                ListeNichtA.add(s);
            }
        }
        System.out.println("WithA: " + ListeA);
        System.out.println("WithoutA: " + ListeNichtA);


        myString.replaceAll(s -> s + " yo bro");

        System.out.println("ListeNew: " + myString);

    }
}
