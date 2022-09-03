package leetcode._139;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        "leetcode",
                        Arrays.asList("leet", "code"),
                        true
                )
        );
    }

    @DisplayName("문자열 s와 문자열 wordDict 사전이 주어지면 s를 공백으로 구분된 하나 이상의 사전 단어 시퀀스로 분할할 수 있으면 true를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 단어_나누기(String s, List<String> wordDict, boolean result) {
        Solution sol = new Solution();
        assertThat(sol.wordBreak(s, wordDict)).isEqualTo(result);
    }
}
