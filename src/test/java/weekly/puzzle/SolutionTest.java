package weekly.puzzle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solution () {
        Solution sol = new Solution();

        int[][] gameBoard = {
                {1,1,0,0,1,0},
                {0,0,1,0,1,0},
                {0,1,1,0,0,1},
                {1,1,0,1,1,1},
                {1,0,0,0,1,0},
                {0,1,1,1,0,0}
        };

        int[][] table = {
                {1,0,0,1,1,0},
                {1,0,1,0,1,0},
                {0,1,1,0,1,1},
                {0,0,1,0,0,0},
                {1,1,0,1,1,0},
                {0,1,0,0,0,0}
        };

        Assertions.assertEquals(14, sol.solution(gameBoard, table));
    }
}