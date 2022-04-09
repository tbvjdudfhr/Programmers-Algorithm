package inflearn._6_4;

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
                        5,
                        new int[]{1, 2, 3, 2, 6, 2, 3, 5, 7},
                        "7 5 3 2 6 "
                )
        );
    }

    @DisplayName("캐시메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 캐시메모리(int input, int[] input2, String result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
