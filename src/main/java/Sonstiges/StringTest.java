package Sonstiges;

public class StringTest {
    public static void main(String[] args) {

        // Wie viele neue String-Objekte werden mit
        // der for-Schliefe erzeugt?
        for (int i = 0; i < 100; i++) {
            m();
        }

    }

    static String m() {
        String s = str;
        String s2 = "mo";
        String s3 = s2;

        return s3.toString();
    }

    static String str = "mo";

}
