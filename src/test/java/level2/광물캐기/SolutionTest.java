package level2.광물캐기;


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
                        new int[]{1, 3, 2},
                        new String[]{"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"},
                        12
                ),
                Arguments.of(
                        new int[]{0, 1, 1},
                        new String[]{"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"},
                        50
                )
        );
    }

    @DisplayName("마인이 갖고 있는 곡괭이의 개수를 나타내는 정수 배열 picks와 광물들의 순서를 나타내는 문자열 배열 minerals가 매개변수로 주어질 때, 마인이 작업을 끝내기까지 필요한 최소한의 피로도 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 광물_캐기(int[] picks, String[] minerals, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(picks, minerals)).isEqualTo(result);
    }
}