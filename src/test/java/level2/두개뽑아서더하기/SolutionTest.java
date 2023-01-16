package level2.두개뽑아서더하기;

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
                        new int[]{2, 1, 3, 4, 1},
                        new int[]{2, 3, 4, 5, 6, 7}
                ),
                Arguments.of(
                        new int[]{5, 0, 2, 7},
                        new int[]{2, 5, 7, 9, 12}
                )
        );
    }

    @DisplayName("정수 배열 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 두_개_뽑아서_더하기(int[] numbers, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(numbers)).isEqualTo(result);
    }
}