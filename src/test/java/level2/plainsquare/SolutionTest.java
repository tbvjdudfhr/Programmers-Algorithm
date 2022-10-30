package level2.plainsquare;

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
                        8,
                        12,
                        80
                )
        );
    }

    @DisplayName("가로의 길이 W와 세로의 길이 H가 주어질 때, 사용할 수 있는 정사각형의 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 멀쩡한_사각형(int w, int h, long result) {
        Solution solution = new Solution();
        assertThat(solution.solution(w, h)).isEqualTo(result);
    }
}
