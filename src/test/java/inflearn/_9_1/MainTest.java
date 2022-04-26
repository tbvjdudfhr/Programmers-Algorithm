package inflearn._9_1;

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
                        new ArrayList<>(Arrays.asList(Main.Player.of(172, 67),
                                Main.Player.of(183, 65),
                                Main.Player.of(180, 70),
                                Main.Player.of(170, 72),
                                Main.Player.of(181, 60))
                        ),
                        3
                )
        );
    }

    @DisplayName("N명의 지원자가 주어지면 최대 몇 명의 선수를 선발할 수 있는지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 씨름선수(ArrayList<Main.Player> input, int result) {
        assertThat(Main.Solution(input)).isEqualTo(result);
    }
}
