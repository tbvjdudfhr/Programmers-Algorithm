package level2.weapon;

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
                        5,
                        3,
                        2,
                        10
                ), Arguments.of(
                        10,
                        3,
                        2,
                        21
                )
        );
    }

    @DisplayName("무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 기사단원의_무기(int number, int limit, int power, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(number, limit, power)).isEqualTo(result);
    }
}
