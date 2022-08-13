package wadiz._2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();
        String[] str = {"a=3", "..a=4", "..b=3", "..print a", ".......a=6", ".......print a", ".......print b", "..print a", "....a=7", "....print a", "print a", "print b", "a=4", "print a", "...print a"};
        String[] result = {"a=4", "a=6", "b=3", "a=4", "a=7", "a=3", "error", "a=4", "a=4"};
        Assertions.assertEquals(result, sol.solution(str));
    }
}