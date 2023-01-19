package level2.시소짝꿍;

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
                        new int[]{100, 180, 360, 100, 270},
                        4
                )
        );
    }

    @DisplayName("시소 짜꿍이 몇 쌍 존재하는지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 시소_짝꿍(int[] weights, long result) {
        Solution solution = new Solution();
        assertThat(solution.solution(weights)).isEqualTo(result);
    }
}