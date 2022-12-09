package level2.nearestletter;

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
                        "banana",
                        new int[]{-1, -1, -1, 2, 2, 2}
                ),
                Arguments.of(
                        "foobar",
                        new int[]{-1, -1, 1, -1, -1, -1}
                )
        );
    }

    @DisplayName("문자열 s이 주어질 때, 위와 같이 정의된 연산을 수행하는 함수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 가장_가까운_같은_글자(String s, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(s)).isEqualTo(result);
    }
}
