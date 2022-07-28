package leetcode._209;

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
                        new int[]{1, 4, 4},
                        1
                ),
                Arguments.of(
                        11,
                        new int[]{1, 1, 1, 1, 1, 1, 1, 1},
                        0
                ),
                Arguments.of(
                        7,
                        new int[]{2,3,1,2,4,3},
                        2
                ),
                Arguments.of(
                        11,
                        new int[]{1,2,3,4,5},
                        3
                ),
                Arguments.of(
                        5,
                        new int[]{2,3,1,1,1,1,1},
                        2
                )
        );
    }

    @DisplayName("양의 정수 벼열의 하위 배열의 합이 타겟이 될 때 최소 길이 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 최소_크기_부분배열_합계(int target, int[] nums, int result) {
        Solution sol = new Solution();
        assertThat(sol.minSubArrayLen(target, nums)).isEqualTo(result);
    }
}