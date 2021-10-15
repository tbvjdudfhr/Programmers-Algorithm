package season3_2.level1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    Solution sol = new Solution();

    static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        10, 3
                ),
                Arguments.of(
                        12, 11
                )
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    public void solution(int n, int result) {
        assertThat(sol.solution(n)).isEqualTo(result);
    }
}