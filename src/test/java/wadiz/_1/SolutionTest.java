package wadiz._1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();
        int[][] passwords = {{101,1234}};
        String s = "101#1234#102#654321#51#203#201#202#1#";
        Assertions.assertEquals(2, sol.solution(passwords, s));
    }
}