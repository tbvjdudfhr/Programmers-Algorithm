package dfsbfs.word;

import custom.CustomParameterizedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    Solution sol = new Solution();

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        "hit",
                        "cog",
                        new String[]{"hot", "dot", "dog", "lot", "log", "cog"},
                        4
                ),
                Arguments.of(
                        "hit",
                        "cog",
                        new String[]{"hot", "dot", "dog", "lot", "log"},
                        0
                )
        );
    }

    @CustomParameterizedTest
    @DisplayName("단어 변환 테스트")
    @MethodSource("args")
    void solutionTest(String begin, String target, String[] words, int result) {
        assertThat(sol.solution(begin, target, words)).isEqualTo(result);
    }
}