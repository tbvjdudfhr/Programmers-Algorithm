package inflearn._2_11;

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
                        new int[][]{{2, 3, 1, 7, 3}, {4, 1, 9, 6, 8}, {5, 5, 2, 4, 4}, {6, 5, 2, 6, 7}, {8, 4, 2, 2, 2}},
                        4
                )
        );
    }

    @DisplayName("전체 학생 중에서 같은 반이었던 학생 수가 제일 많은 학생 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 임시반장_정하기(int[][] input, int result) {
        assertThat(Solution.soluton(input)).isEqualTo(result);
    }
}
