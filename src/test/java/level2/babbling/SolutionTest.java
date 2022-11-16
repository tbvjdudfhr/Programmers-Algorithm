package level2.babbling;

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
                        new String[]{"aya", "yee", "u", "maa"},
                        1
                ), Arguments.of(
                        new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"},
                        2
                )
        );
    }

    @DisplayName("문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 옹알이_2(String[] babbling, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(babbling)).isEqualTo(result);
    }
}
