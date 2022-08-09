package leetcode._15;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[]{-1, 0, 1, 2, -1, -4},
                        Lists.list(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1))
                )
        );
    }

    @DisplayName("정수 배열이 주어지면 모든 삼중항의 합이 0인 경우 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 샴중항(int[] nums, List<List<Integer>> result) {
        Solution sol = new Solution();
        assertThat(sol.threeSum(nums)).isEqualTo(result);
    }
}
