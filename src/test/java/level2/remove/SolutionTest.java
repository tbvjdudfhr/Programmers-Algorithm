package level2.remove;

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
                        "baabaa",
                        1
                )
        );
    }

    @DisplayName("문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 짝지어_제거하기(String s, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(s)).isEqualTo(result);
    }
}
