package Vererbung;

public class Main {
    public static void main(String[] args) {

        Human h1=new Human();
        h1.name="Jonas";
        h1.height=179;
        h1.weight=75;

        Human h2=new Human();
        h2.name="Awat";
        h2.height=179;
        h2.weight=85;

        System.out.println("اطلاعات شخص اول:");
        System.out.println("نام: " + h1.name);
        System.out.println("قد: " + h1.height + " سانتی‌متر");
        System.out.println("وزن: " + h1.weight + " کیلوگرم");

        System.out.println("--------------------");

        System.out.println("اطلاعات شخص دوم:");
        System.out.println("نام: " + h2.name);
        System.out.println("قد: " + h2.height + " سانتی‌متر");
        System.out.println("وزن: " + h2.weight + " کیلوگرم");

    }
}
