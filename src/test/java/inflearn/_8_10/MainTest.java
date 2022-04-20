package inflearn._8_10;

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
                                {0, 1, 1, 0, 0, 0, 0, 1},
                                {0, 1, 1, 0, 1, 1, 0, 0},
                                {0, 1, 0, 0, 0, 0, 0, 0}
                        },
                        8
                )
        );
    }

    @DisplayName("미로탐색 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 미로탐색(int[][] input, int result) {
        Main.board = input;
        Main.board[1][1] = 1;
        Main.DFS(1, 1);
        assertThat(Main.answer).isEqualTo(result);
    }
}
