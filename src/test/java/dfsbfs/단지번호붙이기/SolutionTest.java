package dfsbfs.단지번호붙이기;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{0, 1, 1, 0, 1, 0, 0},
                                {0, 1, 1, 0, 1, 0, 1},
                                {1, 1, 1, 0, 1, 0, 1},
                                {0, 0, 0, 0, 1, 1, 1},
                                {0, 1, 0, 0, 0, 0, 0},
                                {0, 1, 1, 1, 1, 1, 0},
                                {0, 1, 1, 1, 0, 0, 0}},
                        Arrays.asList(3, 7, 8, 9)
                )
        );
    }

    @DisplayName("지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 단지번호붙이기(int[][] graph, ArrayList<Integer> result) {
        Solution solution = new Solution();
        assertThat(solution.solution(graph)).isEqualTo(result);
    }
}