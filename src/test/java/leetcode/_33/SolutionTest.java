package leetcode._33;

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
                        new int[]{4, 5, 6, 7, 0, 1, 2},
                        0,
                        4
                ),
                Arguments.of(
                        new int[]{1},
                        1,
                        0
                )
        );
    }

    @DisplayName("주어진 숫자의 첫번째 위치와 마지막 위치 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 숫자_위치_찾기(int[] nums, int target, int result) {
        Solution sol = new Solution();
        assertThat(sol.search(nums, target)).isEqualTo(result);
    }
}
