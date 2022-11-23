package level2.dividenumbercards;

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
                        new int[]{10, 17},
                        new int[]{5, 20},
                        0
                ), Arguments.of(
                        new int[]{10, 20},
                        new int[]{5, 17},
                        10
                )
        );
    }

    @DisplayName("주어진 조건을 만족하는 가장 큰 양의 정수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 숫자_카드_나누기(int[] arrayA, int[] arrayB, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(arrayA, arrayB)).isEqualTo(result);
    }
}
