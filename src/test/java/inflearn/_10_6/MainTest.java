package inflearn._10_6;

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
                        5,
                        20,
                        new ArrayList<>(Arrays.asList(Main.Problem.of(10, 5),
                                Main.Problem.of(25, 12),
                                Main.Problem.of(15, 8),
                                Main.Problem.of(6, 3),
                                Main.Problem.of(7, 4))
                        ),
                        41
                )
        );
    }

    @DisplayName("최대점수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 최대점수_구하기(int input, int input2, ArrayList<Main.Problem> input3, int result) {
        Main.number = input;
        Main.time = input2;
        Main.solution(input3);
        assertThat(Main.dp[input2]).isEqualTo(result);
    }
}
