package level2.foodfight;

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
                        new int[]{1, 3, 4, 6},
                        "1223330333221"
                )
        );
    }

    @DisplayName("수웅이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가 주어졌을 때, 대회를 위한 음식의 배치를 나타내는 문자열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 푸드_파이트_대회(int[] food, String result) {
        Solution solution = new Solution();
        assertThat(solution.solution(food)).isEqualTo(result);
    }
}
