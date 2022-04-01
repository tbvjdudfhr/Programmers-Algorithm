package inflearn._6_1;

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
                        new int[]{13, 5, 11, 7, 23, 15},
                        "5 7 11 13 15 23 "
                )
        );
    }

    @DisplayName("선택 정렬 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 선택_정렬(int[] input, String result) {
        assertThat(Main.solution(input)).isEqualTo(result);
    }
}
