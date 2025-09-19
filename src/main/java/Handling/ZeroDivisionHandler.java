package Handling;

import javax.sound.midi.Soundbank;
import java.io.InputStreamReader;
import java.util.Scanner;

public class  ZeroDivisionHandler {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {
            System.out.println("عدد اول را وارد کنید : ");
            int numerator= scanner.nextInt();
            System.out.println("عدد دوم را وارد کنید :  ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;

            System.out.println("نتیجه: " + result);

        } catch (ArithmeticException e) {
            System.out.println("خطا: تقسیم بر صفر مجاز نیست!");
            System.out.println("لطفاً یک عدد غیر از صفر را به عنوان مقسوم علیه وارد کنید.");
        }

        System.out.println("\nبرنامه به پایان رسید و به درستی مدیریت شد.");
    }
}
