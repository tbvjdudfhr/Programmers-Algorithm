package nhn.first;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
               /* Arguments.of(
                        new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}},
                        new int[][]{{5, 7, 9, 11, 13}, {11, 13, 15, 17, 19}},
                        2
                ),*/
                Arguments.of(
                        new int[][]{{13,21,24,29,50}, {1,12,20,21,32}, {16,26,34,46,52},{9,11,16,16,21},{2,8,10,16,20}},
                        new int[][]{{5,10,15,41,49}, {6,10,10,10,46}, {5, 42,43,51,52}, {5,6,11,13,45}, {5,9,11,13,45}},
                        4
                )
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void test(int[][] cards1, int[][] cards2, int result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.solution(cards1, cards2)).isEqualTo(result);
    }
}
