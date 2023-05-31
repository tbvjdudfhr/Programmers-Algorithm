package bookpractice.chapter3.삼각달팽이;


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
                        4,
                        new int[]{1, 2, 9, 3, 10, 8, 4, 5, 6, 7}
                ),
                Arguments.of(
                        5,
                        new int[]{1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9}
                ),
                Arguments.of(
                        6,
                        new int[]{1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11]}
                )
        );
    }

    @DisplayName("반시계 방향으로 달팽이 채우기를 진행한 후, 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 삼각_달팽이(int n, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(n)).isEqualTo(result);
    }
}