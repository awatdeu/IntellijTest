package Return;

//public class Calculator {
//
//    public static void main(String[] args) {
//
//       int result= sum(20,50);
//        System.out.println(result);
//    }
//    // public static void sum(int numFirst,int numNext) >>>>  Cf - void kann nicht reurn
// public static int sum(int numFirst,int numNext){
//
//        int sum=numFirst+numNext;
//        return sum;
//
// }}

public class Calculator{

    // در اینجا عدد اول و دوم تولید میشود باهم جمع میشوند و نتیحه را داخل متغیر sum برمیگرداند
    public int add(int number1,int number2){
        int sum= number1+number2;
        return sum;
    }
    public static void main(String[]args){
        Calculator calc =new Calculator(); // ساخت یک شی calc
        int result= calc.add(10 , 20); // add فراخوانی میشه با دو مقدار عدد اول و دوم
        System.out.println("Sum: " + result);
    }

}