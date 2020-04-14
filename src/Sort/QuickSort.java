package Sort;

public class QuickSort {
    private static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void partition(int[] array,int begin,int end){
        if(begin>=end) return;
        int i =begin;int j = end;
        int tmp = array[(begin+end)/2];
        while (i<j){
            while (tmp>array[i]){i++;}
            while (tmp<array[j]){j--;}
            if(i<=j){
                swap(array, i, j);
                i++;j--;
            }
        }

        partition(array, begin, j);
        partition(array, i, end);
    }
}
