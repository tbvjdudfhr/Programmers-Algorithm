package inflearn._8_13;

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
                        7,
                        new int[][]{
                                {1, 1, 0, 0, 0, 1, 0},
                                {0, 1, 1, 0, 1, 1, 0},
                                {0, 1, 0, 0, 0, 0, 0},
                                {0, 0, 0, 1, 0, 1, 1},
                                {1, 1, 0, 1, 1, 0, 0},
                                {1, 0, 0, 0, 1, 0, 0},
                                {1, 0, 1, 0, 1, 0, 0},
                        },
                        5
                )
        );
    }

    @DisplayName("섬나라 아일랜드에 몇개의 섬이 있는지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 섬나라_아일랜드(int input, int[][] input2, int result) {
        Main.board = input2;
        Main.n = input;
        
        for (int i = 0; i < Main.n; i++) {
            for (int j = 0; j < Main.n; j++) {
                if (Main.board[i][j] == 1) {
                    Main.DFS(i, j);
                    Main.answer++;
                }
            }
        }

        assertThat(Main.answer).isEqualTo(result);
    }
}
