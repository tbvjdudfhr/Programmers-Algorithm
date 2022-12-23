package level2.크기가작은부분문자열;

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
                        "3141592",
                        "271",
                        2
                ),
                Arguments.of(
                        "500220839878",
                        "7",
                        8
                ),
                Arguments.of(
                        "10203",
                        "15",
                        3
                )
        );
    }

    @DisplayName("숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 크기가_작은_부분_문자열(String t, String p, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(t, p)).isEqualTo(result);
    }
}
