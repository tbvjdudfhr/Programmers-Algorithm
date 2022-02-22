package inflearn._1_6;

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
                        "ksekkset",
                        "kset"
                )
        );
    }

    @DisplayName("소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 중복_문자_제거(String text, String result) {
        final inflearn._1_6.Solution solution = new inflearn._1_6.Solution();

        assertThat(solution.solution(text)).isEqualTo(result);
    }
}
