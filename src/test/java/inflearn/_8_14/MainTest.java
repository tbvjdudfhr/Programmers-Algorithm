package inflearn._8_14;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        4,
                        4,
                        new int[][]{
                                {0, 1, 2, 0},
                                {1, 0, 2, 1},
                                {0, 2, 1, 2},
                                {2, 0, 1, 2},
                        },
                        6
                )
        );
    }

    @DisplayName("도시의 피자배달거리가 최소가 되는 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 피자배달거리(int input, int input2, int[][] input3, int result) {
        Main.n = input;
        Main.m = input2;
        Main.pz = new ArrayList<>();
        Main.hs = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                int tmp = input3[i][j];
                if (tmp == 1) Main.hs.add(new Main.Point(i, j));
                else if (tmp == 2) Main.pz.add(new Main.Point(i, j));
            }
        }
        Main.len = Main.pz.size();
        Main.combi = new int[input2];
        Main.dfs(0, 0);

        assertThat(Main.answer).isEqualTo(result);
    }
}
