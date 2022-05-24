package kakao.word;

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
                        "one4seveneight",
                        1478
                ),
                Arguments.of(
                        "23four5six7",
                        234567
                ),
                Arguments.of(
                        "2three45sixseven",
                        234567
                ),
                Arguments.of(
                        "123",
                        123
                )
        );
    }

    @DisplayName("숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열을 원래 숫자로 변환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 숫자_문자열과_영단어(String str, int result) {
        Solution sol = new Solution();
        assertThat(sol.solution(str)).isEqualTo(result);
    }
}
