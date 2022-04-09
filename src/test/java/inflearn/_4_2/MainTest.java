package inflearn._4_2;

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
                        "AbaAeCe",
                        "baeeACA",
                        "YES"
                ),
                Arguments.of(
                        "abaCC",
                        "Caaab",
                        "No"
                )
        );
    }

    @DisplayName("길이가 같은 두개의 단어가 주어지면 두 단어가 아나그램인지 판별 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 아나그램(String input, String input2, String result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}

