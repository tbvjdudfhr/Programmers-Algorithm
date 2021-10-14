package season3_2.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();

    static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        3,
                        2,
                        5,
                        new int[]{3, 2, 2, 3}
                ), Arguments.of(
                        4,
                        7,
                        14,
                        new int[]{4, 3, 3, 3, 4, 4, 4, 4}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void solution(int n, int left, int right, int[] result) {
        assertThat(sol.solution(n, left, right)).isEqualTo(result);
    }
}

