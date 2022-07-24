package leetcode._54;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}},
                        Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void solutionTest(int[][] matrix, List<Integer> result) {
        Solution sol = new Solution();
        assertThat(sol.spiralOrder(matrix)).isEqualTo(result);
    }
}