package bookpractice.chapter5.하노이의탑;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] solution(int n) {
        List<int[]> moves = new ArrayList<>();
        move(n, 1, 3, 2, moves);
        int[][] movesArray = new int[moves.size()][2];
        for (int i = 0; i < moves.size(); i++) {
            movesArray[i] = moves.get(i);
        }
        return movesArray;
    }

    private void move(int n, int from, int to, int aux, List<int[]> moves) {
        if (n == 1) {
            moves.add(new int[]{from, to});
            return;
        }

        move(n - 1, from, aux, to, moves);
        moves.add(new int[]{from, to});
        move(n - 1, aux, to, from, moves);
    }
}