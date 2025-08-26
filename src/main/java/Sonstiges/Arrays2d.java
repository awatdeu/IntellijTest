package Sonstiges;
import java.util.Arrays;
public class Arrays2d {
    public static void main(String[] args) {
     //   int [][] a= new int[5][5];
        int[][] a={{3,12,4,1},{4,2,9},{9,16,7},{10,1,14,12,19},{1}};
//        a [0][0]=4;
//        a[1][0]=7;
//        a[2][0]= 12;
//        a[2][2]= 12;
        for(int i=0;i<a.length ;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
