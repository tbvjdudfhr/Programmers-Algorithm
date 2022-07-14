package jadencase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        "3people unFollowed me",
                        "3people Unfollowed Me"
                ),
                Arguments.of(
                        "for the last week",
                        "For The Last Week"
                )
        );
    }

    @DisplayName("JadenCase 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void JadenCase_문자열_만들기(String s, String result) {
        Solution sol = new Solution();
        assertThat(sol.solution(s)).isEqualTo(result);
    }
}
