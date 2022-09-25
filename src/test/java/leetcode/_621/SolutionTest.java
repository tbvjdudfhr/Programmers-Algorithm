package leetcode._621;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new char[]{'A', 'A', 'A', 'B', 'B', 'B'},
                        2,
                        8
                )
        );
    }

    @DisplayName("CPU가 주어진 모든 작업을 완료하는 데 걸리는 최소 시간 단위를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 작업_스케줄러(char[] tasks, int n, int result) {
        Solution sol = new Solution();
        Assertions.assertThat(sol.leastInterval(tasks, n)).isEqualTo(result);
    }
}
