package inflearn._6_5;

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
                        new int[]{20, 25, 52, 30, 39, 33, 43, 33},
                        "D"
                )
        );
    }

    @DisplayName("중복된 숫자 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 중복_확인(int[] input, String result) {
        assertThat(Main.solution(input)).isEqualTo(result);
    }
}
