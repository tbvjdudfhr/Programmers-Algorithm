package leetcode._55;

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
                        new int[]{2, 3, 1, 1, 4},
                        true
                ),
                Arguments.of(
                        new int[]{3, 2, 1, 0, 4},
                        false
                )
        );
    }

    @DisplayName("배열이 주어지면 마지막에 도달 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 점프_게임(int[] nums, boolean result) {
        Solution sol = new Solution();
        assertThat(sol.canJump(nums)).isEqualTo(result);
    }
}

