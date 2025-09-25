package Verargs;

public class ArrayAsVarargs {

    public static void display(String... items) {
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] fruits = {"سیب", "پرتقال", "موز"};

        // ارسال آرایه به صورت مستقیم
        display(fruits); // خروجی: سیب پرتقال موز

        // ارسال آرگومان‌های جداگانه
        display("کتاب", "دفتر", "قلم"); // خروجی: کتاب دفتر قلم
    }
}
