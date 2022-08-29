package leetcode._62;

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
                        3,
                        7,
                        28
                ),
                Arguments.of(
                        3,
                        2,
                        3
                )
        );
    }

    @DisplayName("두 개의 정수 m과 n이 주어지면 로봇이 오른쪽 하단 모서리에 도달하기 위해 취할 수 있는 고유한 경로의 수를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 고유_경로(int m, int n, int result) {
        Solution sol = new Solution();
        assertThat(sol.uniquePaths(m, n)).isEqualTo(result);
    }
}
