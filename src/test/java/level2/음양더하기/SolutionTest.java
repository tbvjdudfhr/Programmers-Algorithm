package level2.음양더하기;

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
                        new int[]{4, 7, 12},
                        new boolean[]{true, false, true},
                        9
                )
        );
    }

    @DisplayName("원형 수열의 연속 부분 수열 합으로 만들 수 있는 수의 개수")
    @ParameterizedTest
    @MethodSource("args")
    void 음양_더하기(int[] absolutes, boolean[] signs, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(absolutes, signs)).isEqualTo(result);
    }
}
