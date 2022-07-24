package leetcode._11;

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
                        new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7},
                        49
                ),
                Arguments.of(
                        new int[]{1, 1},
                        1
                )
        );
    }

    @DisplayName("컨테이너에 가장 많은 물이 포함되도록 두개의 선 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void containerWithMostWater(int[] height, int result) {
        Solution sol = new Solution();
        assertThat(sol.maxArea(height)).isEqualTo(result);
    }
}
