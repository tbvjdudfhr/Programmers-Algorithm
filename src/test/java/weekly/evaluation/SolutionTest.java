package weekly.evaluation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();

        int[][] arr = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
        Assertions.assertEquals("FBABD", sol.solution(arr));
        int[][] arr2 = {{50,90},{50,87}};
        Assertions.assertEquals("DA", sol.solution(arr2));
    }

}