package level2.쿼드압축후개수세기;

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
                        new int[][]{{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}},
                        new int[]{4, 9}
                )
        );
    }

    @DisplayName("arr이 매개변수로 주어집니다. 위와 같은 방식으로 arr을 압축했을 때, 배열에 최종적으로 남는 0의 개수와 1의 개수를 배열에 담아서 return 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 쿼드압축_후_개수_세기(int[][] arr, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(arr)).isEqualTo(result);
    }
}
