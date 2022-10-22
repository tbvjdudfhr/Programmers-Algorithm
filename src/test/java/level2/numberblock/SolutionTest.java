package level2.numberblock;

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
                        1,
                        10,
                        new int[]{0, 1, 1, 2, 1, 3, 1, 4, 3, 5}
                )
        );
    }

    @DisplayName("구간을 나타내는 두 수 begin, end 가 매개변수로 주어 질 때, 그 구간에 깔려 있는 블록의 숫자 배열(리스트) 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 숫자_블록(long begin, long end, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(begin, end)).isEqualTo(result);
    }
}
