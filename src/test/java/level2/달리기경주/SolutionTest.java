package level2.달리기경주;

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
                        new String[]{"mumu", "soe", "poe", "kai", "mine"},
                        new String[]{"kai", "kai", "mine", "mine"},
                        new String[]{"mumu", "kai", "mine", "soe", "poe"}
                )
        );
    }

    @DisplayName("선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 달리기_경주(String[] players, String[] callings, String[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(players, callings)).isEqualTo(result);
    }
}