package inflearn._2_12;

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
                        new int[][]{{3, 4, 1, 2}, {4, 3, 2, 1}, {3, 1, 4, 2}},
                        3
                )
        );
    }

    @DisplayName("수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우의 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 멘토링(int[][] input, int result) {
        assertThat(Solution.soluton(input)).isEqualTo(result);
    }
}
