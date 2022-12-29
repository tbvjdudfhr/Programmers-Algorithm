package level2.마법의엘리베이터;

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
                        16,
                        6
                ),
                Arguments.of(
                        2554,
                        16
                )
        );
    }

    @DisplayName("민수와 마법의 엘리베이터가 있는 층을 나타내는 정수 storey 가 주어졌을 때, 0층으로 가기 위해 필요한 마법의 돌의 최소값 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 마법의_엘레베이터(int storey, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(storey)).isEqualTo(result);
    }
}
