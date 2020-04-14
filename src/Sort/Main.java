package Sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5,2,3,3,9,1,6};
       QuickSort3.sort(array,0,array.length-1);
        IntStream stream =  Arrays.stream(array);
        stream.forEach(System.out::println);
    }
}
