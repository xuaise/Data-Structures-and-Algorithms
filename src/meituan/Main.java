package meituan;

public class Main {
    public static void main(String[] args) {
        FirstLastPosition sr = new FirstLastPosition();
       int[] arr = new int[]{5,7,7,8,8,10};//[4,5,6,7,0,1,2]

        System.out.println(sr.search(arr, 8));
    }
}
