package kakao.formulas;

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
                        "100-200*300-500+20",
                        60420
                ),
                Arguments.of(
                        "50*6-3*2",
                        300
                )
        );
    }

    @DisplayName("연산 수식을 작성하여 가장 큰 수 만들기 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 수식_최대화(String expression, String result) {
        Solution sol = new Solution();
        assertThat(sol.solution(expression)).isEqualTo(result);
    }
}
