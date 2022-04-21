package inflearn._8_11;

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
                        new int[][]{
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 1, 1, 1, 1, 1, 0},
                                {0, 0, 0, 0, 1, 0, 0, 0},
                                {0, 1, 1, 0, 1, 0, 1, 1},
                                {0, 1, 1, 0, 1, 0, 0, 0},
                                {0, 1, 0, 0, 0, 1, 0, 0},
                                {0, 1, 0, 1, 0, 0, 0, 0}
                        },
                        12
                )
        );
    }

    @DisplayName("미로의 최단거리 통로 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 미로의_최단거리_통로(int[][] input, int result) {
        Main.board = input;
        Main.dis = new int[8][8];
        Main.BFS(1, 1);
        assertThat(Main.dis[7][7]).isEqualTo(result);
    }
}
