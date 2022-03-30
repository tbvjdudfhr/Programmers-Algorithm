package inflearn._5_7;

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
                        "CBA",
                        "CBDAGE",
                        "YES"
                )
        );
    }

    @DisplayName("필수과목순서가 주어지면 N개의 수업설계 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 교육과정_설계(String input, String input2, String result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
