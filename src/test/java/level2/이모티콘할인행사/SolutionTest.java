package level2.이모티콘할인행사;

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
                        new int[][]{{40, 10000}, {25, 10000}},
                        new int[]{7000, 9000},
                        new int[]{7000, 9000}
                ),
                Arguments.of(
                        new int[][]{{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}},
                        new int[]{1300, 1500, 1600, 4900},
                        new int[]{4, 13860}
                )
        );
    }

    @DisplayName("사 목적을 최대한으로 달성했을 때의 이모티콘 플러스 서비스 가입 수와 이모티콘 매출액을 1차원 정수 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 이모티콘_할인행사(int[][] users, int[] emoticons, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(users, emoticons)).isEqualTo(result);
    }
}
