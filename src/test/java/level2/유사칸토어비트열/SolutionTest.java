package level2.유사칸토어비트열;

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
                        17,
                        8
                )
        );
    }

    @DisplayName("n과 1의 개수가 몇 개인지 알고 싶은 구간을 나타내는 l, r이 주어졌을 때 그 구간 내의 1의 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 유사_칸토어_비트열(int n, long l, long r, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(n, l, r)).isEqualTo(result);
    }
}
