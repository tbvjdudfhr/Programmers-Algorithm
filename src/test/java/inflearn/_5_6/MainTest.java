package inflearn._5_6;

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
                        8,
                        3,
                        7
                )
        );
    }

    @DisplayName("N과 K가 주어질 때 공주를 구하러 갈 왕자의 번호를 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 공주_구하기(int input, int input2, int result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
