package inflearn._3_2;

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
                        new int[]{1, 3, 9, 5, 2},
                        new int[]{3, 2, 5, 7, 8},
                        new ArrayList<>(Arrays.asList(2, 3, 5))
                )
        );
    }

    @DisplayName("두 집합의 공통 원소를 추출하여 오름차순으로 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 공통원소_구하기(int[] input, int[] input2, ArrayList result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
