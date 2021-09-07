package weekly._6weeks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution sol = new Solution();

//        int[] weights = {50, 82, 75, 120};
//        String[] head2head ={"NLWL","WNLL","LWNW","WWLN"};
//        int[] result = {3, 4, 1, 2};

        int[] weights = {60, 70, 60};
        String[] head2head ={"NNN", "NNN", "NNN"};
        int[] result = {2, 1, 3};

        Assertions.assertEquals(result, sol.solution(weights, head2head));
    }
}