package Sort;

public class HeapSort {
    private static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sort(int[] array){
        int len = array.length-1;
       while (len>0){
           buildHeap(array, len);
           swap(array, 0, len);
           len--;
       }

    }
    public static void buildHeap(int[] array,int length){

        for(int i = length%2 == 0?(length-2)/2:(length-1)/2;i>=0;i--){
            int left = 2*i+1;
            int right = 2*i+2;

            if(array[i]<array[left]) {
                swap(array, i, left);
            }
            if(right<=length&&array[i]<array[right]){
                swap(array, i, right);
            }
        }
    }
}
