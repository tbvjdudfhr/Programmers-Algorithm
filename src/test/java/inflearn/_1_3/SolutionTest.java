package inflearn._1_3;

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
                        "it is time to study",
                        "study"
                )
        );
    }

    @DisplayName("한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 문장_속_단어(String text, String result) {
        final inflearn._1_3.Solution solution = new inflearn._1_3.Solution();

        assertThat(solution.solution(text)).isEqualTo(result);
    }
}
