package level2.뒤에있는큰수찾기;

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
                        new int[]{2, 3, 3, 5},
                        new int[]{3, 5, 5, -1}
                ),
                Arguments.of(
                        new int[]{9, 1, 5, 3, 6, 2},
                        new int[]{-1, 5, 6, 6, -1, -1}
                )
        );
    }

    @DisplayName("모든 원소에 대한 뒷 큰수들을 차례로 담은 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 숫자_변환하기(int[] numbers, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(numbers)).isEqualTo(result);
    }
}