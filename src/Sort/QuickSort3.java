package Sort;

public class QuickSort3 {
    private static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void sort(int[] array,int lo ,int hi){
        if(lo>= hi){ return;}
        int v = array[lo];
        int i = lo+1;
        int lt = lo;int gt = hi;
        while (i<=gt){
            if(array[i]<v){swap(array, i++, lt++);}
            else if(array[i]>v) {swap(array, i, gt--);}
            else i++;
        }
        sort(array, lo, lt-1);
        sort(array, gt+1, hi);
    }
}
