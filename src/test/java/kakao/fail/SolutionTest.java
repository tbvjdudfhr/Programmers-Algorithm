package kakao.fail;

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
                        5,
                        new int[]{2, 1, 2, 6, 2, 4, 3, 3},
                        new int[]{3, 4, 2, 1, 5}
                ),
                Arguments.of(
                        4,
                        new int[]{4, 4, 4, 4, 4},
                        new int[]{4, 1, 2, 3}
                )
        );
    }

    @DisplayName("실패율이 높은 스테이지부터 내림차순으로 번호 정렬 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 실패율(int n, int[] stages, int[] result) {
        Solution sol = new Solution();
        assertThat(sol.solution(n, stages)).isEqualTo(result);
    }
}
