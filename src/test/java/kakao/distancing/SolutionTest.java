package kakao.distancing;

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
                        new String[][]{
                                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
                        },
                        new int[]{1, 0, 1, 1, 1}
                )
        );
    }

    @DisplayName("거리두기 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 거리두기_확인하기(String[][] places, int[] result) {
        Solution sol = new Solution();
        assertThat(sol.solution(places)).isEqualTo(result);
    }
}
