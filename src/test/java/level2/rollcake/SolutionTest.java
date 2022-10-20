package level2.rollcake;

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
                        new int[]{1, 2, 1, 3, 4, 1, 2},
                        2
                )
        );
    }

    @DisplayName("롤케이크에 올려진 토핑들의 번호를 저장한 정수 배열 topping이 매개변수로 주어질 때, 롤케이크를 공평하게 자르는 방법의 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 롤케이크_자르기(int[] topping, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(topping)).isEqualTo(result);
    }
}
