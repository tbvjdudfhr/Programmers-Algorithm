package level2.미로탈출;

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
                        new String[]{"SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE"},
                        16
                ),
                Arguments.of(
                        new String[]{"LOOXS", "OOOOX", "OOOOO", "OOOOO", "EOOOO"},
                        -1
                )
        );
    }

    @DisplayName("미로를 나타낸 문자열 배열 maps가 매개변수로 주어질 때, 미로를 탈출하는데 필요한 최소 시간 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 미로_탈출(String[] maps, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(maps)).isEqualTo(result);
    }
}
