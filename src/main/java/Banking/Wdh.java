package Banking;


import java.util.ArrayList;
import java.util.List;

public class Wdh {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(-7);
        list.add(4);
        list.add(-11);

//         This line removes all elements greater than 0
        list.removeIf(x -> x > 0);

        // This will print the final size of the list
        System.out.println(list.size());
    }
}
