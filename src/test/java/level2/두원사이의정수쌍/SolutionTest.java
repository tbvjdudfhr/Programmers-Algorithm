package level2.두원사이의정수쌍;

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
                        3,
                        20
                )
        );
    }

    @DisplayName("두 원 사이의 공간에 x좌표와 y좌표가 모두 정수인 점의 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 대충_만든_자판(int r1, int r2, long result) {
        Solution solution = new Solution();
        assertThat(solution.solution(r1, r2)).isEqualTo(result);
    }
}