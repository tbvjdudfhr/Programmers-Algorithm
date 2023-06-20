package bookpractice.chapter5.쿼드압축후개수세기;

public class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        compress(arr, 0, 0, arr.length, answer);
        return answer;
    }

    private void compress(int[][] arr, int row, int col, int size, int[] answer) {
        if (isCompressed(arr, row, col, size)) {
            answer[arr[row][col]]++;
            return;
        }

        int newSize = size / 2;
        compress(arr, row, col, newSize, answer);
        compress(arr, row, col + newSize, newSize, answer);
        compress(arr, row + newSize, col, newSize, answer);
        compress(arr, row + newSize, col + newSize, newSize, answer);
    }

    private boolean isCompressed(int[][] arr, int row, int col, int size) {
        int value = arr[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}