package inflearn._6_10;

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
                        new int[]{1, 2, 8, 4, 9},
                        3
                )
        );
    }

    @DisplayName("마구간 정하기 결정 알고리즘 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 마구간_정하기(int input, int[] input2, int result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}

