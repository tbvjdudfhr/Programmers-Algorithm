package inflearn._2_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[]{7, 3, 9, 5, 6, 12},
                        "7 9 6 12"
                )
        );
    }

    @DisplayName("N개의 정수를 입력받아 자신의 바로 앞 수보다 큰 수만 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 큰_수_출력하기(int[] ints, String result) {
        final inflearn._2_1.Solution solution = new inflearn._2_1.Solution();

        assertThat(solution.solution(ints)).isEqualTo(result);
    }
}
