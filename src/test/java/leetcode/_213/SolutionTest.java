package leetcode._213;

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
                        new int[]{2, 3, 2},
                        3
                ),
                Arguments.of(
                        new int[]{1, 2, 3, 1},
                        4
                )
        );
    }

    @DisplayName("집의 금액을 나타내는 정수 배열 숫자가 주어지면 경찰에 알리지 않고 오늘 밤 도둑질할 수 있는 최대 금액을 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 하우스_로버_투(int[] nums, int result) {
        Solution sol = new Solution();
        assertThat(sol.rob(nums)).isEqualTo(result);
    }
}

