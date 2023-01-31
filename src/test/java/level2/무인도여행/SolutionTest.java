package level2.무인도여행;

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
                        new String[]{"X591X", "X1X5X", "X231X", "1XXX1"},
                        new int[]{1, 1, 27}
                ),
                Arguments.of(
                        new String[]{"XXX", "XXX", "XXX"},
                        new int[]{-1}
                )
        );
    }

    @DisplayName("지도를 나타내는 문자열 배열 maps가 매개변수로 주어질 때, 각 섬에서 최대 며칠씩 머무를 수 있는지 배열에 오름차순 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 무인도_여행(String[] maps, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(maps)).isEqualTo(result);
    }
}