package CarPkg;

public class Car {

    // --- اعضای غیر استاتیک (Non-Static) ---
    // این متغیرها به هر "شیء" ماشین تعلق دارند
    String model;
    String color;

    // --- اعضای استاتیک (Static) ---
    // این متغیر متعلق به خودِ "کلاس" Car است و بین همه اشیاء مشترک است
    static int carCounter = 0;

    // سازنده (Constructor): وقتی یک ماشین جدید ساخته می‌شود، این کد اجرا می‌شود
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        carCounter++; // با ساخت هر ماشین جدید، شمارنده استاتیک یکی اضافه می‌شود
    }

    // --- متد غیر استاتیک (Non-Static) ---
    // این متد اطلاعات یک "شیء" خاص را نمایش می‌دهد
    public void displayInfo() {
        System.out.println("مدل این ماشین: " + this.model + "، رنگ: " + this.color);
    }

    // --- متد استاتیک (Static) ---
    // این متد اطلاعات کلی مربوط به "کلاس" را نمایش می‌دهد
    // برای فراخوانی آن نیازی به ساختن ماشین نداریم
    public static void displayTotalCars() {
        System.out.println("تعداد کل ماشین‌های ساخته شده: " + carCounter);
    }

    public static void main(String[] args) {
        // فراخوانی متد استاتیک "مستقیماً از روی کلاس"
        // دقت کنید که هنوز هیچ ماشینی نساخته‌ایم!
        Car.displayTotalCars(); // خروجی: تعداد کل ماشین‌های ساخته شده: 0

        System.out.println("--- ساخت ماشین‌های جدید ---");

        // ساختن دو "شیء" (نمونه) از کلاس Car
        Car car1 = new Car("پراید", "سفید");
        Car car2 = new Car("پژو", "نقره‌ای");

        // فراخوانی متد غیر استاتیک (مربوط به شیء)
        // باید حتما روی یک شیء مشخص صدا زده شود
        car1.displayInfo(); // خروجی: مدل این ماشین: پراید، رنگ: سفید
        car2.displayInfo(); // خروجی: مدل این ماشین: پژو، رنگ: نقره‌ای

        // فراخوانی دوباره متد استاتیک از روی کلاس
        // حالا مقدار شمارنده تغییر کرده است
        Car.displayTotalCars(); // خروجی: تعداد کل ماشین‌های ساخته شده: 2

        // این کار خطا می‌دهد، چون متد displayInfo استاتیک نیست و به یک شیء نیاز دارد
        // Car.displayInfo(); // ERROR!
    }
}