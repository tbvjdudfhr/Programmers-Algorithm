package bookpractice.chapter2.이진변환반복하기;


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
                ),
                Arguments.of(
                        "01110",
                        new int[]{3, 3}
                ),
                Arguments.of(
                        "1111111",
                        new int[]{4, 1}
                )
        );
    }

    @DisplayName("s가 \"1\"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 이진_변환_반복하기(String s, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(s)).isEqualTo(result);
    }
}