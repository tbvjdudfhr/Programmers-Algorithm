package level2.coke;

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
                        2,
                        1,
                        20,
                        29
                ), Arguments.of(
                        3,
                        1,
                        20,
                        9
                )
        );
    }

    @DisplayName("받을 수 있는 콜라의 병 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 콜라_문제(int a, int b, int n, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(a, b, n)).isEqualTo(result);
    }
}
