package Methods;

public class MeStatic {

    public static void main(String[] args) {
        System.out.println("1. شروع اجرای متد main");
        firstMethod(); // فراخوانی اولین متد
        System.out.println("8. پایان اجرای متد main");
    }

    public static void firstMethod() {
        System.out.println("2. وارد متد firstMethod شدیم");
        secondMethod(); // فراخوانی دومین متد از داخل اولین متد
        System.out.println("7. از متد firstMethod خارج می‌شویم");
    }

    public static void secondMethod() {
        System.out.println("3. وارد متد secondMethod شدیم");
        thirdMethod(); // فراخوانی سومین متد از داخل دومین متد
        System.out.println("6. از متد secondMethod خارج می‌شویم");
    }

    public static void thirdMethod() {
        System.out.println("4. وارد متد thirdMethod شدیم");
        System.out.println("5. کار در متد thirdMethod تمام شد و از آن خارج می‌شویم");
    }
}