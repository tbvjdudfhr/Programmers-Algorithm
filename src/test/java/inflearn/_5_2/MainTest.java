package inflearn._5_2;

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
                        "(A(BC)D)EF(G(H)(IJ)K)LM(N)",
                        "EFLM"
                )
        );
    }

    @DisplayName("괄호 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 괄호문자제거(String input, String result) {
        assertThat(Main.solution(input)).isEqualTo(result);
    }
}
