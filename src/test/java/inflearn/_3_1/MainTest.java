package inflearn._3_1;

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
                        new int[]{1, 3, 5},
                        new int[]{2, 3, 6, 7, 9},
                        new ArrayList<>(Arrays.asList(1, 2, 3, 3, 5, 6, 7, 9))
                )
        );
    }

    @DisplayName("두 배열이 주어지면 두 배열을 오름차순으로 합치는 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 두_배열_합치기(int[] input, int[] input2, ArrayList<Integer> result) {
        assertThat(Main.combineTwoArrays(input, input2)).isEqualTo(result);
    }
}
