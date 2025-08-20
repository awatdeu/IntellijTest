package Sonstiges;

public class ExceptionTut {

public static String methode(){


    try{
        //potentiell Fehleranfälliger Code
        int x = 0;
        int a = 10/x;// Fehler da wir durch 0 Teilen, der Compiler kann das nicht sehen
        // nur zur Laufzeit sehen wir das x = 0 ist
        System.out.println("Ich werde nicht ausgeführt wenn es zu einem Fehler über mir im try block kommt");
        return "huhu try";
    }

    catch (Exception e) {

        //System.exit(4);
        System.out.println("Fehler wurde gefangen");
        //e.printStackTrace();
        // hier springt Java in den Finally Block führt den aus und springt dann zurück und returned
        return "Hi catch ";
    }
    finally {
        System.out.println("Wenn kein Fehler in try block ICH LAUFE");
        System.out.println("Wenn Fehler in try block und der wurde gecatched ICH LAUFE");
        System.out.println("Wenn Fehler in try block und der wurde NICHT gecatched ICH LAUFE");
        System.out.println("Ich laufe FAST (System.exit()) immer, da ich in Finally block bin");
        ;

    }




}


    public static void main(String[] args) {


     methode();

        System.out.println("Und wenn der Fehler gefangen wurde lebten sie glücklich bis ans Lebensende");

    }
}
