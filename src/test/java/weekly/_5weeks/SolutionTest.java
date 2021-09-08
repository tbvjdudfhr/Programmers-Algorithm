package weekly._5weeks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();
        Assertions.assertEquals(6, sol.solution("AAAAE"));
    }
}