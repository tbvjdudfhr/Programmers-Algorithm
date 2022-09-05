package leetcode._300;

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
                        new int[]{10, 9, 2, 5, 3, 7, 101, 18},
                        4
                )
        );
    }

    @DisplayName("정수 배열 nums가 주어지면 가장 긴 증가하는 부분 시퀀스의 길이를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 가장_긴_증가_부분_수열(int[] nums, int result) {
        Solution sol = new Solution();
        assertThat(sol.lengthOfLIS(nums)).isEqualTo(result);
    }
}
