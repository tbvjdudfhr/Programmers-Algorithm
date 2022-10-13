package level2.binary;

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
                        "110010101001",
                        new int[]{3, 8}
                )
        );
    }

    @DisplayName("0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 이진_변환_반복하기(String s, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(s)).isEqualTo(result);
    }
}
