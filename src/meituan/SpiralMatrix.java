package meituan;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;int right = matrix[0].length-1;int up = 0;int down = matrix.length-1;
        List<Integer> list = new ArrayList<>();
        int i = 0;int j = 0;
        while (up<=down&&left<=right){
            while (i<=right){
                list.add(matrix[i][j]);
                i++;
            }
            up--;
            while (j<=down){
                list.add(matrix[i][j]);
                j++;
            }
            right--;
            while (i>=left){
                list.add(matrix[i][j]);
                i--;
            }
            down--;
            while (j>=up){
                list.add(matrix[i][j]);
                j--;
            }
            left++;
        }
        return list;
    }
}
