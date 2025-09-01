package Sonstiges;

public class New1 {
    public static Integer sum(int max){
        if (max>0)
        return max+sum(max-1);
        else
            return 0;

    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
