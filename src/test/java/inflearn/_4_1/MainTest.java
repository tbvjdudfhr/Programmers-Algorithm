package inflearn._4_1;

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
                        15,
                        "BACBACCACCBDEDE",
                        'C'
                )
        );
    }

    @DisplayName("연속된 K일간의 최대 매출액 계산 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 학급_회장(int input, String input2, char result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
