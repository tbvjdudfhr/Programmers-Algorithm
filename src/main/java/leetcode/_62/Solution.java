package leetcode._62;

public class Solution {
    int[][] ints;
    int[][] directions = {{1, 0}, {0, 1}};
    int count = 0;

    public int uniquePaths(int m, int n) {
        ints = new int[m][n];
        dfs(0, 0);
        return count;
    }

    private void dfs(int row, int column) {
        int rowLength = ints.length;
        int columnLength = ints[0].length;
        if (row == rowLength - 1 && column == columnLength - 1) {
            count++;
        }

        for (int[] direction: directions) {
            int nextRow = row + direction[0];
            int nextColumn = column + direction[1];
            if(nextRow < rowLength && nextColumn < columnLength) {
                dfs(nextRow, nextColumn);
            }
        }

    }
}
