package inflearn._6_8;

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
                        32,
                        new int[]{23, 87, 65, 12, 57, 32, 99, 81},
                        "3"
                )
        );
    }

    @DisplayName("이분검색으로 오름차순 정렬에서 숫자 순서 찾기 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 이분검색(int input, int[] input2, String result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
