package pccp2._1.실습용로봇;


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
                        "GRGLGRG",
                        new int[]{2, 2}
                ),
                Arguments.of(
                        "GRGRGRB",
                        new int[]{2, 0}
                )
        );
    }

    @DisplayName("로봇이 주어진 명령어들을 순서대로 모두 수행한 뒤 도착한 최종 위치의 좌푯값 x, y를 순서대로 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 실습용_로봇(String command, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(command)).isEqualTo(result);
    }
}