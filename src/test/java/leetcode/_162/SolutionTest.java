package leetcode._162;

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
                        new int[]{1, 2, 3, 1},
                        2
                ),
                Arguments.of(
                        new int[]{1, 2, 1, 3, 5, 6, 4},
                        5
                )
        );
    }

    @DisplayName("정수 배열이 주어지면 피크요소를 찾고 해당 인덱스 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 피크_요소_찾기(int[] nums, int result) {
        Solution sol = new Solution();
        assertThat(sol.findPeakElement(nums)).isEqualTo(result);
    }
}
