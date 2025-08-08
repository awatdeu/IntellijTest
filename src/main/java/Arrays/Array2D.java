package Arrays;

public class Array2D {

    public static void main(String[] args) {
        int[][] array2d={{1,2},{3,4,5}};

        show(array2d);

    }

    public static void show(int[][] array2d) {

        for (int row=0; row < array2d.length;row++ ){

            for (int column=0; column< array2d[row].length;column++ ){
                System.out.print(array2d[row][column]+" ");
        }
        System.out.println();
    }
}
}