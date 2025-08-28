package Sonstiges;

public class WdhStringBuilder {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder(new StringBuilder()
                .append("Montag")
                .replace(0, 3, "Frei")
                .substring(0, 4));
//                .append("!");

        System.out.println(sb);


        StringBuilder tmp = null;
        tmp.replace(0, 0, "");
    }
}