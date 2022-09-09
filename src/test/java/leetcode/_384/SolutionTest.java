package leetcode._384;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3}
                )
        );
    }

    @DisplayName("정수 배열 숫자가 주어지면 배열을 무작위로 섞는 알고리즘 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 배열_섞기(int[] nums) {
        Solution sol = new Solution(nums);
        sol.shuffle();
        Assertions.assertThat(sol.reset()).isEqualTo(nums);
    }
}
