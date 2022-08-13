package test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Test2Test {
    private  static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        4,
                        "FRI",
                        new int[]{6, 21, 23, 27, 28},
                        10
                ),
                Arguments.of(
                        3,
                        "SUN",
                        new int[]{2, 6, 17, 29},
                        8
                ),
                Arguments.of(
                        30,
                        "MON",
                        new int[]{1, 2, 3, 4, 28, 29, 30},
                        30
                )
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    public void solutionTest(int leave, String day, int[] holidays, int result) {
        Test2 t = new Test2();
        assertThat(t.solution(leave, day, holidays)).isEqualTo(result);
    }
}