package inflearn._8_12;

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
                        4,
                        6,
                        new int[][]{
                                {0, 0, -1, 0, 0, 0},
                                {0, 0, 1, 0, -1, 0},
                                {0, 0, -1, 0, 0, 0},
                                {0, 0, 0, 0, -1, 1}
                        },
                        4
                )
        );
    }

    @DisplayName("며칠이 지나몀 토마토들이 모두 익는지, 그 최소 일수를 구하는 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 토마토(int input, int input2, int[][] input3, int result) {
        Main.dis = new int[input][input2];
        Main.board = input3;
        Main.n = input;
        Main.m = input2;

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input2; j++) {
                int x = Main.board[i][j];
                if (x == 1) Main.queue.add(new Main.Point(i, j));
            }
        }

        Main.BFS();

        for (int[] row : Main.dis) {
            for (int r : row) {
                Main.answer = Math.max(Main.answer, r);
            }
        }

        assertThat(Main.answer).isEqualTo(result);
    }
}
