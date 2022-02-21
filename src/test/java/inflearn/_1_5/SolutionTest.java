package inflearn._1_5;

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
                        "a#b!GE*T@S",
                        "S#T!EG*b@a"
                )
        );
    }

    @DisplayName("영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집는 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 특정_문자_뒤집기(String text, String result) {
        final inflearn._1_5.Solution solution = new inflearn._1_5.Solution();

        assertThat(solution.solution(text)).isEqualTo(result);
    }
}
