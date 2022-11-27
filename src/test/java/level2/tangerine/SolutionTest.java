package level2.tangerine;

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
                        6,
                        new int[]{1, 3, 2, 5, 4, 5, 2, 3},
                        3
                ), Arguments.of(
                        4,
                        new int[]{1, 3, 2, 5, 4, 5, 2, 3},
                        2
                )
        );
    }

    @DisplayName("경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 귤_고르기(int k, int[] tangerine, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(k, tangerine)).isEqualTo(result);
    }
}
