package inflearn._5_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        "(()(()))(()",
                        "NO"
                ),
                Arguments.of(
                        "(()(()))()",
                        "YES"
                )
        );
    }

    @DisplayName("올바른 괄호이면 YES, 올바르지 않으면 NO 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 올바른_괄호(String input, String result) {
        assertThat(Main.solution(input)).isEqualTo(result);
    }
}
