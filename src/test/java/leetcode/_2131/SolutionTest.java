package leetcode._2131;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new String[]{"lc", "cl", "gg"},
                        6
                )
        );
    }

    @DisplayName("생성할 수 있는 가장 긴 회문의 길이를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 두_글자_단어를_연결하여_가장_긴_회문(String[] words, int result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.longestPalindrome(words)).isEqualTo(result);
    }
}
