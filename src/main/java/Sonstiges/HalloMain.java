package Sonstiges;

public class HalloMain {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String originalString = "Hallo";
        String reversed = reverseString(originalString);
        System.out.println(reversed);
    }
}