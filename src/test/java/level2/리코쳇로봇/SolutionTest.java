package level2.리코쳇로봇;

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
                        "...D..R", ".D.G...", "....D.D", "D....D.", "..D....",
                        7
                ),
                Arguments.of(
                        ".D.R", "....", ".G..", "...D",
                        4
                )
        );
    }

    @DisplayName("임판의 상태를 나타내는 문자열 배열 board가 주어졌을 때, 말이 목표위치에 도달하는데 최소 몇 번 이동해야 하는지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 리코쳇_로봇(String[] board, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(board)).isEqualTo(result);
    }
}