package inflearn._1_1;

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
                        "Computercooler",
                        'c',
                        2
                )
        );
    }

    @DisplayName("한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 문자_찾기(String text, char t, int result) {
        final Solution solution = new Solution();

        assertThat(solution.solution(text, t)).isEqualTo(result);
    }
}

