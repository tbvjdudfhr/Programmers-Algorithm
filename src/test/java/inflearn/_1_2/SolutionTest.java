package inflearn._1_2;

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
                        "StuDY",
                        "sTUdy"
                )
        );
    }

    @DisplayName("대소문자와 소문자 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 대소문자_변환(String text, String result) {
        final inflearn._1_2.Solution solution = new inflearn._1_2.Solution();

        assertThat(solution.solution(text)).isEqualTo(result);
    }
}
