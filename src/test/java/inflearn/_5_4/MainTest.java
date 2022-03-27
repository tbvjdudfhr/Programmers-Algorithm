package inflearn._5_4;

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
                        "352+*9-",
                        "12"
                )
        );
    }

    @DisplayName("후위연산이 주어지면 연산한 결과 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 후위식_연산(String input, String result) {
        assertThat(Main.solution(input)).isEqualTo(result);
    }
}
