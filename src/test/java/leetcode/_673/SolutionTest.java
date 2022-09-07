package leetcode._673;

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
                        new int[]{1, 3, 5, 4, 7},
                        2
                )
        );
    }

    @DisplayName("정수 배열 숫자가 주어지면 가장 길게 증가하는 하위 시퀀스의 수를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 가장_긴_증가_부분_수열의_수(int[] nums, int result) {
        Solution sol = new Solution();
        assertThat(sol.findNumberOfLIS(nums)).isEqualTo(result);
    }
}
