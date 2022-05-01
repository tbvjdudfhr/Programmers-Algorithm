package inflearn._9_7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        new ArrayList<>(Arrays.asList(Main.Edge.of(1, 2, 12),
                                Main.Edge.of(1, 9, 25),
                                Main.Edge.of(2, 3, 10),
                                Main.Edge.of(2, 8, 17),
                                Main.Edge.of(2, 9, 8),
                                Main.Edge.of(3, 4, 18),
                                Main.Edge.of(3, 7, 55),
                                Main.Edge.of(4, 5, 44),
                                Main.Edge.of(5, 6, 60),
                                Main.Edge.of(5, 7, 38),
                                Main.Edge.of(7, 8, 35),
                                Main.Edge.of(8, 9, 15))
                        ),
                        196
                )
        );
    }

    @DisplayName("최소스패닝트리 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 원더랜드(int[] ints, ArrayList<Main.Edge> input, int result) {
        Main.parent = ints;
        assertThat(Main.solution(input)).isEqualTo(result);
    }
}
