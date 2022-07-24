package leetcode._54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix[0].length;
        int column = matrix.length;
        int count = 0;
        int totalCount = row * column;
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = row -1;
        int top = 0;
        int bottom = column - 1;
        while (count < totalCount) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
                count++;

            }
            top++;

            if(count == totalCount) break;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
                count++;
            }
            right--;

            if(count == totalCount) break;

            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
                count++;
            }
            bottom--;


            if(count == totalCount) break;

            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
                count++;
            }
            left++;

            if(count == totalCount) break;
        }

        return list;
    }
}
