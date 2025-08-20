package Sonstiges;

public class ReihenfolgeCatch {


    public static void main(String[] args)  {


        try{
            int [] arr = {1,2,3};
            //ArrayIndexOutOfBoundException wird erzeugt
            //System.out.println(arr[7]);
            String stringy = "Stringy";
            //int a = 10/0;
            System.out.println(stringy.codePointBefore(19));
        }

        /* Kann mir bei Array nicht helfen, das ArrayIndex... keine SUBKLASSE von StringIndex ist*/
catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
}

        // ArrayIndexOutOfBoundException ist kind von Indexout  DAHER kann auch INDEXout catch helfen
catch (IndexOutOfBoundsException ie) {
                System.out.println("IndexOutOfBoundsException");

}
catch (Exception e) {
            System.out.println("exception");

        }
    }

}
