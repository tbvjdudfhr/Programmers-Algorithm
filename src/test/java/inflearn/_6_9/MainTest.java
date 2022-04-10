package inflearn._6_9;

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
                        3,
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                        17
                )
        );
    }

    @DisplayName("뮤직비디오 결정 알고리즘 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 뮤직비디오(int input, int[] input2, String result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
