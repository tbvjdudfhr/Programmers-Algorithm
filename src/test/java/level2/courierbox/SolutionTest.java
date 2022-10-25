package level2.courierbox;

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
                        new int[]{4, 3, 1, 2, 5},
                        2
                ),
                Arguments.of(
                        new int[]{5, 4, 3, 2, 1},
                        5
                )
        );
    }

    @DisplayName("택배 기사님이 원하는 상자 순서를 나타내는 정수 배열 order가 주어졌을 때, 영재가 몇 개의 상자를 실을 수 있는지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 택배상자(int[] order, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(order)).isEqualTo(result);
    }
}
