package inflearn._9_2;

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
                        new ArrayList<>(Arrays.asList(Main.Meeting.of(1, 4),
                                Main.Meeting.of(2, 3),
                                Main.Meeting.of(3, 5),
                                Main.Meeting.of(4, 6),
                                Main.Meeting.of(5, 7))
                        ),
                        3
                ),
                Arguments.of(
                        new ArrayList<>(Arrays.asList(Main.Meeting.of(3, 3),
                                Main.Meeting.of(1, 3),
                                Main.Meeting.of(2, 5))
                        ),
                        2

                )
        );
    }

    @DisplayName("각 회의에 대해 시작시간과 끝나는 시간이 주어져있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 최대수의 회의 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 회의실_배정(ArrayList<Main.Meeting> input, int result) {
        assertThat(Main.Solution(input)).isEqualTo(result);
    }
}
