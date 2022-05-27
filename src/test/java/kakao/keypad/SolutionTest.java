package kakao.keypad;


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
                        new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},
                        "right",
                        "LRLLLRLLRRL"
                ),
                Arguments.of(
                        new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},
                        "left",
                        "LRLLRRLLLRR"
                ),
                Arguments.of(
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                        "right",
                        "LLRLLRLLRL"
                )
        );
    }

    @DisplayName("각 번호를 누른 손가락이 오른손인지 왼손인지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 키패드_누르기(int[] numbers, String hand, String result) {
        Solution sol = new Solution();
        assertThat(sol.solution(numbers, hand)).isEqualTo(result);
    }
}
