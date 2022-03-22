package inflearn._4_4;

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
                        "bacaAacba",
                        "abc",
                        3
                )
        );
    }

    @DisplayName("S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 모든_아나그램_찾기(String input, String input2, int result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
