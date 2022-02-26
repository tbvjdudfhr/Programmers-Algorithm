package inflearn._1_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        "KKHSSSSSSSE",
                        "K2HS7E"
                ), Arguments.of(
                        "KSTTTSEEKFKKKDJJGG",
                        "KST3SE2KFK3DJ2G2"
                )
        );
    }

    @DisplayName("문자열 문자가 연속으로 반복되는 경우 반복되는 문자 오른쪽에 반복회수 표기 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 문자열_압축(String text, String result) {
        final inflearn._1_11.Solution solution = new inflearn._1_11.Solution();

        assertThat(solution.solution(text)).isEqualTo(result);
    }
}
