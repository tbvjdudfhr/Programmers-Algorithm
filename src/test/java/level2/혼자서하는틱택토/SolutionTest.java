package level2.혼자서하는틱택토;

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
                        new String[]{"O.X", ".O.", "..X"},
                        1
                ),
                Arguments.of(
                        new String[]{"OOO", "...", "XXX"},
                        0
                ),
                Arguments.of(
                        new String[]{"...", ".X.", "..."},
                        0
                ),
                Arguments.of(
                        new String[]{"...", "...", "..."},
                        1
                )
        );
    }

    @DisplayName("머쓱이가 혼자서 게임을 진행하다 의문이 생긴 틱택토 게임판의 정보를 담고 있는 문자열 배열 board가 매개변수로 주어질 때, 이 게임판이 규칙을 지켜서 틱택토를 진행했을 때 나올 수 있는 게임 상황이면 1을 아니라면 0 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 혼자서_하는_틱택토(String[] board, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(board)).isEqualTo(result);
    }
}