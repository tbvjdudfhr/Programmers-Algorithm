package level2.연속된부분수열의합;

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
                        new int[]{1, 2, 3, 4, 5},
                        7,
                        new int[]{9, 4}
                ),
                Arguments.of(
                        new int[]{1, 1, 1, 2, 3, 4, 5},
                        5,
                        new int[]{6, 6}
                ),
                Arguments.of(
                        new int[]{2, 2, 2, 2, 2},
                        6,
                        new int[]{0, 2}
                )
        );
    }

    @DisplayName("수열을 나타내는 정수 배열 sequence와 부분 수열의 합을 나타내는 정수 k가 매개변수로 주어질 때, 위 조건을 만족하는 부분 수열의 시작 인덱스와 마지막 인덱스를 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 연속된_부분_수열의_합(int[] sequence, int k, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(sequence, k)).isEqualTo(result);
    }
}