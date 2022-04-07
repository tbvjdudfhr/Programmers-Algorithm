package inflearn._6_7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static inflearn._6_7.Main.Point;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(Arrays.asList(Point.of(2, 7), Point.of(1, 3)))
                        , new ArrayList<>(Arrays.asList(Point.of(1, 3), Point.of(2, 7)))

                )
        );
    }

    @DisplayName("N개의 평면상의 좌표가 주어지면 모든 좌표를 오름차순 정렬 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 좌표_정렬(ArrayList<Point> input, ArrayList<Point> result) {
        assertThat(Main.sortedList(input)).isEqualTo(result);
    }
}
