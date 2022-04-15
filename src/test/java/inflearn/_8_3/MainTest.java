package inflearn._8_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static inflearn._8_3.Main.Quiz;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        5,
                        20,
                        new ArrayList<>(Arrays.asList(Quiz.of(10, 5),
                                Quiz.of(25, 12), Quiz.of(15, 8), Quiz.of(6, 3),
                                Quiz.of(7, 4))),
                        41
                )
        );
    }

    @DisplayName("최대점수 구하기 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 최대점수_구하기(int input, int input2, ArrayList<Quiz> input3, int result) {
        Main.n = input;
        Main.longTime = input2;
        Main.DFS(0, 0, 0, input3);
        assertThat(Main.maxScore).isEqualTo(result);
    }
}
