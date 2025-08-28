package StringBuilder;

public class StringAPI {


        public static void main(String[] args) {

            System.out.println("### Konstruktoren ###");
            String leererString = new String();
            String textAusString = new String("Hallo Welt!");
            System.out.println("Leerer String: '" + leererString + "'");
            System.out.println("Text aus String: '" + textAusString + "'");
            System.out.println("-------------------------------------\n");


            System.out.println("### trim() ###");
            String textMitLeerzeichen = "   Hallo Welt!   ";
            System.out.println("Original: '" + textMitLeerzeichen + "'");
            System.out.println("Nach trim(): '" + textMitLeerzeichen.trim() + "'");
            System.out.println("-------------------------------------\n");


            System.out.println("### concat(String) ###");
            String ersterTeil = "Hallo";
            String zweiterTeil = " Welt!";
            String zusammengefuegt = ersterTeil.concat(zweiterTeil);
            System.out.println("Mit concat(): " + zusammengefuegt);
            String plusOperator = ersterTeil + zweiterTeil;
            System.out.println("Mit '+' Operator: " + plusOperator);
            System.out.println("-------------------------------------\n");


            System.out.println("### charAt(int), length(), isEmpty() ###");
            String beispielText = "Java";
            System.out.println("Text: '" + beispielText + "' hat die Länge: " + beispielText.length());
            System.out.println("Zeichen am Index 2: " + beispielText.charAt(2));
            System.out.println("Ist '" + beispielText + "' leer? " + beispielText.isEmpty());
            System.out.println("Ist '" + leererString + "' leer? " + leererString.isEmpty());
            System.out.println("-------------------------------------\n");


            System.out.println("### toUpperCase() & toLowerCase() ###");
            String gemischterText = "Das ist ein Test";
            System.out.println("Original: " + gemischterText);
            System.out.println("toUpperCase(): " + gemischterText.toUpperCase());
            System.out.println("toLowerCase(): " + gemischterText.toLowerCase());
            System.out.println("-------------------------------------\n");


            System.out.println("### startsWith() & endsWith() ###");
            String dateiname = "Rechnung_2025.pdf";
            System.out.println("Dateiname: " + dateiname);
            System.out.println("Beginnt mit 'Rechnung'? " + dateiname.startsWith("Rechnung"));
            System.out.println("Endet mit '.pdf'? " + dateiname.endsWith(".pdf"));
            System.out.println("Beginnt '2025' ab Index 9? " + dateiname.startsWith("2025", 9));
            System.out.println("-------------------------------------\n");


            System.out.println("### equals(Object) & equalsIgnoreCase(String) ###");
            String a = "Test";
            String b = "Test";
            String c = new String("Test");
            String d = "test";
            System.out.println("a = \"Test\", b = \"Test\", c = new String(\"Test\"), d = \"test\"");
            System.out.println("a.equals(b): " + a.equals(b));
            System.out.println("a.equals(c): " + a.equals(c));

            System.out.println("a == b: " + (a == b));
            System.out.println("a == c: " + (a == c));
            System.out.println("Verwende für den Inhaltsvergleich IMMER .equals()!");
            System.out.println("a.equalsIgnoreCase(d): " + a.equalsIgnoreCase(d));
            System.out.println("-------------------------------------\n");


            System.out.println("### indexOf() & lastIndexOf() ###");
            String textFuerIndex = "Hallo Leute, hallo Welt!";
            System.out.println("Text: '" + textFuerIndex + "'");
            System.out.println("indexOf('o'): " + textFuerIndex.indexOf('o'));
            System.out.println("indexOf('o', 5): " + textFuerIndex.indexOf('o', 5));
            System.out.println("indexOf(\"hallo\"): " + textFuerIndex.indexOf("hallo"));
            System.out.println("lastIndexOf('o'): " + textFuerIndex.lastIndexOf('o'));
            System.out.println("-------------------------------------\n");


            System.out.println("### replace() ###");
            String alterSatz = "Die Katze ist grau.";
            System.out.println("Original: " + alterSatz);
            String neuerSatzChar = alterSatz.replace('a', 'o');
            System.out.println("replace('a', 'o'): " + neuerSatzChar);
            String neuerSatzString = alterSatz.replace("grau", "schwarz");
            System.out.println("replace(\"grau\", \"schwarz\"): " + neuerSatzString);
            System.out.println("-------------------------------------\n");


            System.out.println("### substring() ###");
            String langerText = "Willkommen in Deutschland";
            System.out.println("Original: " + langerText);
            String sub1 = langerText.substring(11);
            System.out.println("substring(11): " + sub1);
            String sub2 = langerText.substring(0, 10);
            System.out.println("substring(0, 10): " + sub2);
            System.out.println("-------------------------------------\n");


            System.out.println("### Statische Methode: valueOf() ###");
            int zahl = 123;
            double kommaZahl = 45.67;
            boolean wahrheitswert = true;

            String stringAusInt = String.valueOf(zahl);
            String stringAusDouble = String.valueOf(kommaZahl);
            String stringAusBoolean = String.valueOf(wahrheitswert);

            System.out.println("int " + zahl + " wird zu String \"" + stringAusInt + "\"");
            System.out.println("double " + kommaZahl + " wird zu String \"" + stringAusDouble + "\"");
            System.out.println("boolean " + wahrheitswert + " wird zu String \"" + stringAusBoolean + "\"");
            System.out.println("-------------------------------------\n");
        }
    }
