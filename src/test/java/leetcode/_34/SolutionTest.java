package leetcode._34;

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
                        new int[]{5, 7, 7, 8, 8, 10},
                        8,
                        new int[]{3, 4}
                ),
                Arguments.of(
                        new int[]{5, 7, 7, 8, 8, 10},
                        6,
                        new int[]{-1, -1}
                ),
                Arguments.of(
                        new int[]{},
                        0,
                        new int[]{-1, -1}
                ),
                Arguments.of(
                        new int[]{2,2},
                        2,
                        new int[]{0, 1}
                )
        );
    }

    @DisplayName("주어진 숫자의 첫번째 위치와 마지막 위치 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 숫자_위치_찾기(int[] nums, int target, int[] result) {
        Solution sol = new Solution();
        assertThat(sol.searchRange(nums, target)).isEqualTo(result);
    }
}
