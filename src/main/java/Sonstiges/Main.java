package Sonstiges;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface StringHandler<T> {

    T stringReturner(T s);
}


public class Main {


    public static ArrayList<List<String>> pruefe(List<String> input, Predicate<String> check) {
        ArrayList<String> wahr = new ArrayList<>();
        ArrayList<String> falsch = new ArrayList<>();
        ArrayList<List<String>> results = new ArrayList<>();

        for (String s : input) {
            if (check.test(s)) {

                wahr.add(s);
            } else {

                falsch.add(s);
            }

        }

        results.add(wahr);
        results.add(falsch);

        return results;
    }


    public static List<String> stringMaker(List<String> input, StringHandler<String> handler){
        List<String> bro = new ArrayList<>();
        for(String s: input){

            bro.add(handler.stringReturner(s));
        }
        return bro;
    }

    public static void main(String[] args) {
/*Lösung 1*/
        ArrayList<String> originale = new ArrayList<>();
        originale.add("Hallo");
        originale.add("Anna");
        originale.add("Berta");
        originale.add("Alpha");
        originale.add("hi");

        Predicate<String> pred = (String s) -> s.startsWith("A");

        List<List<String>> results = pruefe(originale, pred);
        System.out.println("Liste von Strings beginnend mit A");
        System.out.println(results.get(0));;
        System.out.println("Liste von Strings NICHT beginnend mit A");
        System.out.println(results.get(1));;

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("42");
        numbers.add("43");
        numbers.add("-34");
        numbers.add("56");

        Predicate<String> pred1 = (String s) -> s =="42" ;

        List<List<String>> results2 = pruefe(numbers, pred1);
        System.out.println("Liste von Integer größer als 42");
        System.out.println(results2.get(0));;
        System.out.println("Liste von Integer kleiner gleich 42");
        System.out.println(results2.get(1));;


/* Lösung 2*/


        StringHandler<String> func = s -> s + " yo Bro";

    List<String> bro2 = stringMaker(originale, func);
        System.out.println(bro2);

    };


/*
Beides mit functional Interfaces
        1. Aufgabe

            Erstelle eine ArrayList mit Strings und Prüfe jeden String ob er mit A beginnt.
        Erstelle zwei Listen eine listeA und eine listeNichtA in die du die Strings sortierst. Beginnt
                ein String mit A soll er in listeA sonst in listeNichtA

                Arraylist<String> myStrings = new ArrayList<>();
                    myStrings.add("Hallo")
                            PREDICATE
*/



        /*
2. Nimm die selbe Liste und konkateniere an jedes wort "yo bro" dran aus "Hallo" in Orignalliste wird
                "Hallo yo bro". Nutze ein Lambda

*/


        Predicate<Integer> p1 = a -> a % 3 == 0;


    }

