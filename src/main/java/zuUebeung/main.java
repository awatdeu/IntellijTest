package zuUebeung;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Fuegen Sie ein Nummer: ");
        int b = myScanner.nextInt();

        switch (b) {
            case 1:
                System.out.println("Eins");
                break;
            case 2:
                System.out.println("Zwei");
                break;
            case 3:
                System.out.println("Drei");
                break;
            case 4:
                System.out.println("Vier");
                break;
            case 5:
                System.out.println("Fünf");
                break;
            case 6:
                System.out.println("Sechs");
                break;
            case 7:
                System.out.println("Sieben");
                break;
            case 8:
                System.out.println("Acht");
                break;
            case 9:
                System.out.println("Neun");
                break;
            default:
                System.out.println("Was ist das?");

        }
    }
}
