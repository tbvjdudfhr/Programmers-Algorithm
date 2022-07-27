package leetcode._713;

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
                        new int[]{10, 5, 2, 6},
                        100,
                        8
                ),
                Arguments.of(
                        new int[]{1, 2, 3},
                        0,
                        0
                )
        );
    }

    @DisplayName("정수 배열과 정수가 주어지면 하위 배열에 요소 곱이 k보다 작은 배열의 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void k보다_작은_부분배열_곱(int[] nums, int k, int result) {
        Solution sol = new Solution();
        assertThat(sol.numSubarrayProductLessThanK(nums, k)).isEqualTo(result);
    }
}