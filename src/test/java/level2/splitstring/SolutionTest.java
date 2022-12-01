package level2.splitstring;

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
                        "banana",
                        3
                ), Arguments.of(
                        "abracadabra",
                        6
                ), Arguments.of(
                        "aaabbaccccabba",
                        3
                )
        );
    }

    @DisplayName("문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고, 분해한 문자열의 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 문자열_나누기(String s, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(s)).isEqualTo(result);
    }
}
