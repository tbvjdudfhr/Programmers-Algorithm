package leetcode._43;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        "2",
                        "3"
                )
        );
    }

    @DisplayName("두 개의 음이 아닌 정수 num1과 num2가 문자열로 표현되면 문자열로 표현되는 num1과 num2의 곱을 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 문자열_곱하기(String num1, String num2, String result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.multiply(num1, num2)).isEqualTo(result);
    }
}
