package leetcode._797;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 2}, {3}, {3}, {}},
                        Lists.list(Arrays.asList(0, 1, 3), Arrays.asList(0, 2, 3))
                )
        );
    }

    @DisplayName("그래프가 주어지면 노드0에서 노드 n-1까지 모든 경로 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 모든_경로(int[][] graph, List<List<Integer>> result) {
        Solution sol = new Solution();
        assertThat(sol.allPathsSourceTarget(graph)).isEqualTo(result);
    }
}
