package bookpractice.chapter2.이상한문자만들기;

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
                        "try hello world",
                        "TrY HeLlO WoRlD"
                ),
                Arguments.of(
                        "try hello world ",
                        "TrY HeLlO WoRlD "
                ),
                Arguments.of(
                        "try hello world  ",
                        "TrY HeLlO WoRlD  "
                )
        );
    }

    @DisplayName("문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 이상한_문자_만들기(String s, String result) {
        Solution solution = new Solution();
        assertThat(solution.solution(s)).isEqualTo(result);
    }
}