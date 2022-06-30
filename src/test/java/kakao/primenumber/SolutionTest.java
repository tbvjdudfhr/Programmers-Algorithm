package kakao.primenumber;

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
                        437674,
                        3,
                        3
                ),
                Arguments.of(
                        110011,
                        10,
                        2
                )
        );
    }

    @DisplayName("정수를 K진수로 바꿧을 때 변환된 수안에서 소수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void k진수에서_소수_개수_구하기(int n, int k, int result) {
        Solution sol = new Solution();
        assertThat(sol.solution(n, k)).isEqualTo(result);
    }
}
