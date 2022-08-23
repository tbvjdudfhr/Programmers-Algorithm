package leetcode._45;

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
                        2
                )
        );
    }

    @DisplayName("배열이 주어지면 처음에는 배열의 첫 번째 인덱스에 위치하게 됩니다. 배열의 각 요소는 해당 위치에서 최대 점프 길이 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 점프_게임_투(int[] nums, int result) {
        Solution sol = new Solution();
        assertThat(sol.jump(nums)).isEqualTo(result);
    }
}

