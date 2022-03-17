package inflearn._3_5;

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
                        3
                )
        );
    }

    @DisplayName("양의 정수 N에 대한 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 가짓수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 연속된_자연수의합(int input, int result) {
        assertThat(Main.solution(input)).isEqualTo(result);
    }
}

