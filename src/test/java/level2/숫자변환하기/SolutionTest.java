package level2.숫자변환하기;

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
                        10,
                        40,
                        5,
                        2
                ),
                Arguments.of(
                        10,
                        40,
                        30,
                        1
                ),
                Arguments.of(
                        2,
                        5,
                        4,
                        -1
                )
        );
    }

    @DisplayName("자연수 x, y, n이 매개변수로 주어질 때, x를 y로 변환하기 위해 필요한 최소 연산 횟수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 숫자_변환하기(int x, int y, int n, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(x, y, n)).isEqualTo(result);
    }
}