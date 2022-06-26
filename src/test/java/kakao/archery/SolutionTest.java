package kakao.archery;

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
                        5,
                        new int[]{2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                        new int[]{0, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0}
                ),
                Arguments.of(
                        1,
                        new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        new int[]{-1}
                ),
                Arguments.of(
                        9,
                        new int[]{0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1},
                        new int[]{1, 1, 2, 0, 1, 2, 2, 0, 0, 0, 0}
                ),
                Arguments.of(
                        10,
                        new int[]{0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 3},
                        new int[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 2}
                )
        );
    }

    @DisplayName("라이언이 우승할 수 없는 경우 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 양궁대회(int n, int[] info, int result) {
        Solution sol = new Solution();
        assertThat(sol.solution(n, info)).isEqualTo(result);
    }
}
