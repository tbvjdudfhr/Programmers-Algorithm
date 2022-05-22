package kakao.id;

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
                        "...!@BaT#*..y.abcdefghijklm",
                        "bat.y.abcdefghi"
                ),
                Arguments.of(
                        "z-+.^.",
                        "z--"
                ),
                Arguments.of(
                        "=.=",
                        "aaa"
                ),
                Arguments.of(
                        "123_.def",
                        "123_.def"
                ),
                Arguments.of(
                        "abcdefghijklmn.p",
                        "abcdefghijklmn"
                )
        );
    }

    @DisplayName("신규 유저가 입력한 아이디를 추천 아이디로 변경 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 신규_아이디_추천(String newId, String result) {
        Solution sol = new Solution();
        assertThat(sol.solution(newId)).isEqualTo(result);
    }
}
