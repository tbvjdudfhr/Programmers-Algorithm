package inflearn._5_5;

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
                        "()(((()())(())()))(())",
                        17
                ),
                Arguments.of(
                        "(((()(()()))(())()))(()())",
                        24
                )
        );
    }

    @DisplayName("쇠막대기와 레이저 배치를 나타내는 괄호 표현이 주어졌을 때, 잘라진 쇠막대기 조각의 총 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 쇠막대기(String input, int result) {
        assertThat(Main.solution(input)).isEqualTo(result);
    }
}
