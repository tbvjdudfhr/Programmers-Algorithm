package inflearn._7_8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        5,
                        14,
                        3
                )
        );
    }

    @DisplayName("BFS 상태트리탐색 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 송아지_찾기(int input, int input2, int result) {
        assertThat(Main.bfs(input, input2)).isEqualTo(result);
    }
}
