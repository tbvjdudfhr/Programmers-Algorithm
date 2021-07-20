package kakao.strzip;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();

        Assertions.assertEquals(7, sol.solution("aabbaccc"));
        Assertions.assertEquals(9, sol.solution("ababcdcdababcdcd"));
        Assertions.assertEquals(8, sol.solution("abcabcdede"));
        Assertions.assertEquals(14, sol.solution("abcabcabcabcdededededede"));
        Assertions.assertEquals(17, sol.solution("xababcdcdababcdcd"));
    }
}
