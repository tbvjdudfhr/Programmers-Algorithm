package level2.makinghamburgers;

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
                        new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1},
                        2
                ), Arguments.of(
                        new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2},
                        0
                )
        );
    }

    @DisplayName("상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때, 상수가 포장하는 햄버거의 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 햄버거_만들기(int[] ingredient, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(ingredient)).isEqualTo(result);
    }
}
