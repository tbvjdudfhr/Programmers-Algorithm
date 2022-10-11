package level2.endtoend;

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
                        3,
                        new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"},
                        new int[]{3, 3}
                )
        );
    }

    @DisplayName("가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 구하는 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 영어_끝말잇기(int n, String[] words, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(n, words)).isEqualTo(result);
    }
}