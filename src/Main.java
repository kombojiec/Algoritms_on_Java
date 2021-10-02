import Interfaces.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] data = {99, 7, 54, 6, 3, 7,1, 85, 16};
        Sort.selectionSort(data);
        System.out.println(Arrays.toString(data));

    }
}
