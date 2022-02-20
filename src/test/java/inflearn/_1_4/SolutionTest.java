package inflearn._1_4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList("good", "Time", "Big"),
                        Arrays.asList("doog", "emiT", "giB")
                )
        );
    }

    @DisplayName("N개의 단어가 주어지면 각 단어를 뒤집는 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 단어_뒤집기(List<String> strings, List<String> result) {
        final inflearn._1_4.Solution solution = new inflearn._1_4.Solution();

        assertThat(solution.solution(strings)).isEqualTo(result);
    }
}
