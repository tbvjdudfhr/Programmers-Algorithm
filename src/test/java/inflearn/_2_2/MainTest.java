package inflearn._2_2;

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
                        new int[]{130, 135, 148, 140, 150, 150, 153},
                        "5"
                )
        );
    }

    @DisplayName("선생님이 볼 수 있는 학생 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 보이는_학생(int[] ints, String result) {
        final inflearn._2_2.Main main = new inflearn._2_2.Main();

        assertThat(main.solution(ints)).isEqualTo(result);
    }
}
