package level2.공원산책;

import level2.대충만든자판.Solution;
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
                        new String[]{"SOO", "OOO", "OOO"},
                        new String[]{"E 2", "S 2", "W 1"},
                        new int[]{2, 1}
                ),
                Arguments.of(
                        new String[]{"SOO", "OXX", "OOO"},
                        new String[]{"E 2", "S 2", "W 1"},
                        new int[]{0, 1}
                ),
                Arguments.of(
                        new String[]{"OSO", "OOO", "OXO", "OOO"},
                        new String[]{"E 2", "S 3", "W 1"},
                        new int[]{0, 0}
                )
        );
    }

    @DisplayName("공원을 나타내는 문자열 배열 park, 로봇 강아지가 수행할 명령이 담긴 문자열 배열 routes가 매개변수로 주어질 때, 로봇 강아지가 모든 명령을 수행 후 놓인 위치를 [세로 방향 좌표, 가로 방향 좌표] 순으로 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 공원_산책(String[] park, String[] routes, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(park, routes)).isEqualTo(result);
    }
}