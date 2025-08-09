package Return;

public class RerutnNo1 {

    public static void main(String[] args) {

       int result= sum(20,50);
        System.out.println(result);
    }
    // public static void sum(int numFirst,int numNext) >>>>  Cf - void kann nicht reurn
 public static int sum(int numFirst,int numNext){

        int sum=numFirst+numNext;
        return sum;

 }
}