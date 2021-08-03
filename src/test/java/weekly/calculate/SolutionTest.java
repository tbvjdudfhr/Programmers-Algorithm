package weekly.calculate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();

        Assertions.assertEquals(10, sol.solution(3, 20, 4));
    }
}