package inflearn._10_4;

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
                        new ArrayList<>(Arrays.asList(Main.Brick.of(25, 3, 4),
                                Main.Brick.of(4, 4, 6),
                                Main.Brick.of(9, 2, 3),
                                Main.Brick.of(16, 2, 5),
                                Main.Brick.of(1, 5, 2)
                        )),
                        10
                )
        );
    }

    @DisplayName("가장 높이 쌓을 수 있는 탑의 높이 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 가장_높은_탑_쌓기(int input, ArrayList<Main.Brick> input2, int result) {
        Main.dp = new int[input];
        assertThat(Main.solution(input2)).isEqualTo(result);
    }
}
