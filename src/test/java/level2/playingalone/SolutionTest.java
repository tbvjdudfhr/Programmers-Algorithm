package level2.playingalone;

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
                        new int[]{8, 6, 3, 7, 2, 5, 1, 4},
                        12
                )
        );
    }

    @DisplayName("상자 안에 들어있는 카드 번호가 순서대로 담긴 배열 cards가 매개변수로 주어질 때, 범희가 이 게임에서 얻을 수 있는 최고 점수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 혼자_놀기의_달인(int[] cards, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(cards)).isEqualTo(result);
    }
}
