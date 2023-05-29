package bookpractice.chapter3.교점에별만들기;

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
                        new int[][]{{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}},
                        new String[]{"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"}
                ),
                Arguments.of(
                        new int[][]{{0, 1, -1}, {1, 0, -1}, {1, 0, 1}},
                        new String[]{"*.*"}
                ),
                Arguments.of(
                        new int[][]{{1, -1, 0}, {2, -1, 0}, {4, -1, 0}},
                        new String[]{"*"}
                )
        );
    }

    @DisplayName("선 A, B, C에 대한 정보가 담긴 배열 line이 매개변수로 주어집니다. 이때 모든 별을 포함하는 최소 사각형 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 교점에_별_만들기(int[][] line, String[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(line)).isEqualTo(result);
    }
}
