package inflearn._1_10;

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
                        "teachermode",
                        'e',
                        new int[]{1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0}
                )
        );
    }

    @DisplayName("한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 가장_짧은_문자거리(String text, char t, int[] result) {
        final inflearn._1_10.Solution solution = new inflearn._1_10.Solution();

        assertThat(solution.solution(text, t)).isEqualTo(result);
    }
}
