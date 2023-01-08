package level2.택배배달과수거하기;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        4,
                        5,
                        new int[]{1, 0, 3, 1, 2},
                        new int[]{0, 3, 0, 4, 0},
                        16
                ),
                Arguments.of(
                        2,
                        7,
                        new int[]{1, 0, 2, 0, 1, 0, 2},
                        new int[]{0, 2, 0, 1, 0, 2, 0},
                        30
                )
        );
    }

    @DisplayName("트럭 하나로 모든 배달과 수거를 마치고 물류창고까지 돌아올 수 있는 최소 이동 거리 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 택배_배달과_수거하기(int cap, int n, int[] deliveries, int[] pickups, long result) {
        Solution solution = new Solution();
        assertThat(solution.solution(cap, n, deliveries, pickups)).isEqualTo(result);
    }
}
