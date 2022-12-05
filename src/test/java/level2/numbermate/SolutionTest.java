package level2.numbermate;

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
                        "100",
                        "2345",
                        "-1"
                ), Arguments.of(
                        "100",
                        "203045",
                        "0"
                )
        );
    }

    @DisplayName("두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 숫자_짝꿍(String X, String Y, String result) {
        Solution solution = new Solution();
        assertThat(solution.solution(X, Y)).isEqualTo(result);
    }
}
