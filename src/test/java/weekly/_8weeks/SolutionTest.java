package weekly._8weeks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution sol = new Solution();
        int[][] sizes = {{60, 50},{30, 70},{60, 30},{80, 40}};
        int result = 4000;

        Assertions.assertEquals(result, sol.solution(sizes));
    }
}