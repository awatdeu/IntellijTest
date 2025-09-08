public class Exp {

    public static void main(String[] args) {

        try {
            System.out.println("a");
            try {
                System.out.println(5 / 0);
                System.out.println("b");

            } catch (Exception e) {
                System.out.println("c");
            }

        } catch (Exception e) {
            System.out.println("d");


            try {
                System.out.println("e");

            } catch (Exception e1) {
                System.out.println("f");

            }
        }
        System.out.println("g");
    }

}