package inflearn._9_4;

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
                        new ArrayList<>(Arrays.asList(Main.Lecture.of(50, 2),
                                Main.Lecture.of(20, 1),
                                Main.Lecture.of(40, 2),
                                Main.Lecture.of(60, 3),
                                Main.Lecture.of(30, 3),
                                Main.Lecture.of(30, 1))
                        ),
                        6,
                        150
                )
        );
    }

    @DisplayName("가장 많은 돈을 벌 수 있도록 강연 스케쥴 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 최대_수입_스케쥴(ArrayList<Main.Lecture> input, int input2, int result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
