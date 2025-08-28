package StringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Moin Deutschland");
        StringBuilder sb3 = new StringBuilder(50);



        System.out.println("A2 ------------------ ");
        // Initialisierung mit append()
        StringBuilder sb4 = new StringBuilder("Moin");
        sb4.append(" Deutschland");
        sb4.append(2025);
        System.out.println("Nach append(): " + sb4);

        // delete()
        sb4.delete(5, 10);
        System.out.println("Nach delete(): " + sb4);

        // deleteCharAt()
        sb4.deleteCharAt(5);
        System.out.println("Nach deleteCharAt(): " + sb4);

        // insert()
        sb4.insert(5, " Java ");
        System.out.println("Nach insert(): " + sb4);

        // replace()
        sb4.replace(11, 14, "Welt");
        System.out.println("Nach replace(): " + sb4);

        // reverse()
        sb4.reverse();
        System.out.println("Nach reverse(): " + sb4);

        // toString()
        String finalText = sb4.toString();
        System.out.println("Als String mit toString(): " + finalText);




        System.out.println("A3 ------------------ ");

        StringBuilder sb5 = new StringBuilder("Java ist eine Programmiersprache");

        // charAt()
        char ch = sb5.charAt(0);
        System.out.println("charAt(0): " + ch);

        // length()
        int len = sb5.length();
        System.out.println("length(): " + len);

        // indexOf()
        int index1 = sb5.indexOf("eine");
        System.out.println("indexOf('eine'): " + index1);

        // LastIndexOf()
        int index2 = sb5.lastIndexOf("e");
        System.out.println("lastIndexOf('e'): " + index2);

        // substring()
        String sub1 = sb5.substring(10);
        System.out.println("substring(10): " + sub1);

        String sub2 = sb5.substring(0, 4);
        System.out.println("substring(0, 4): " + sub2);




        System.out.println("A4 ------------------ ");

        StringBuilder sb6 = new StringBuilder("Java");
        // setCharAt()
        sb6.setCharAt(0, 'L');
        System.out.println("Nach setCharAt(): " + sb6);

        // setLength()
        sb6.setLength(2); // Kürzt die Länge auf 2 -> "La"
        System.out.println("Nach setLength(2): " + sb6);

        sb6.setLength(5);
        System.out.println("Nach setLength(5): " + sb6);



    }
}