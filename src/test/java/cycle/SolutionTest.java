package cycle;

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
                        new String[]{"SL", "LR"},
                        new int[]{16}
                ),
                Arguments.of(
                        new String[]{"S"},
                        new int[]{1, 1, 1, 1}
                ),
                Arguments.of(
                        new String[]{"R", "R"},
                        new int[]{4, 4}
                )
        );
    }

    @DisplayName("주어진 격자를 통해 만들어지는 빛의 경로 사이클의 모든 길이들을 배열에 담아 오름차순으로 정렬 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 빛의_경로_사이클(String[] grid, int[] result) {
        Solution sol = new Solution();
        assertThat(sol.solution(grid)).isEqualTo(result);
    }
}
