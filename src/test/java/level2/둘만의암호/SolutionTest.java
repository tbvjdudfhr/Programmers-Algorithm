package level2.둘만의암호;

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
                        "aukks",
                        "wbqd",
                        5,
                        "happy"
                )
        );
    }

    @DisplayName("두 문자열 s와 skip, 그리고 자연수 index가 매개변수로 주어질 때 위 규칙대로 s를 변환한 결과 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 둘만의_암호(String s, String skip, int index, String result) {
        Solution solution = new Solution();
        assertThat(solution.solution(s, skip, index)).isEqualTo(result);
    }
}