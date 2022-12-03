package level2.dotted;

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
                        2,
                        4,
                        6
                ), Arguments.of(
                        1,
                        5,
                        26
                )
        );
    }

    @DisplayName("정수 k와 원점과의 거리를 나타내는 정수 d가 주어졌을 때, 점이 총 몇 개 찍히는지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 점_찍기(int k, int d, long result) {
        Solution solution = new Solution();
        assertThat(solution.solution(k, d)).isEqualTo(result);
    }
}
