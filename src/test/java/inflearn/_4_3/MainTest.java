package inflearn._4_3;

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
                        7,
                        4,
                        new int[]{20, 12, 20, 10, 23, 17, 10},
                        new ArrayList<>(Arrays.asList(3, 4, 4, 3))
                )
        );
    }

    @DisplayName("N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 매출액의_종류(int input, int input2, int[] input3, ArrayList result) {
        assertThat(Main.solution(input, input2, input3)).isEqualTo(result);
    }
}
