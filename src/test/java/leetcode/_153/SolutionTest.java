package leetcode._153;

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
                        new int[]{3, 4, 5, 1, 2},
                        1
                ),
                Arguments.of(
                        new int[]{4, 5, 6, 7, 0, 1, 2},
                        0
                ),
                Arguments.of(
                        new int[]{11, 13, 15, 17},
                        11
                )
        );
    }

    @DisplayName("오름차순으로 정렬된 배열이 n번 회전한다고 가정했을 때 최소값 찾기 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 회전_정렬_배열에서_최소값_찾기(int[] nums, int result) {
        Solution sol = new Solution();
        assertThat(sol.findMin(nums)).isEqualTo(result);
    }
}
