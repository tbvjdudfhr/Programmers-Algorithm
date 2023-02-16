package pccp._1.외톨이알파벳;

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
                        "edeaaabbccd",
                        "de"
                ),
                Arguments.of(
                        "string",
                        "N"
                )
        );
    }

    @DisplayName("문자열 input_string이 주어졌을 때, 외톨이 알파벳들을 알파벳순으로 이어 붙인 문자열을 return 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 외톨이_알파벳(String input_string, String result) {
        Solution solution = new Solution();
        assertThat(solution.solution(input_string)).isEqualTo(result);
    }
}
