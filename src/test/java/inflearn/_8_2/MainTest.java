package inflearn._8_2;

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
                        259,
                        5,
                        new int[]{81, 58, 42, 33, 61},
                        242
                )
        );
    }

    @DisplayName("N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울수 있는 가장 무거운 무게 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 바둑이_승차(int input, int input2, int[] input3, int result) {
        Main.maxWeight = input;
        Main.n = input2;
        Main.DFS(0, 0, input3);
        assertThat(Main.weight).isEqualTo(result);
    }
}
