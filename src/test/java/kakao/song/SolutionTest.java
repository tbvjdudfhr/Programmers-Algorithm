package kakao.song;

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
                        "ABCDEFG",
                        new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"},
                        "HELLO"
                ),
                Arguments.of(
                        "CC#BCC#BCC#BCC#B",
                        new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"},
                        "FOO"
                ),
                Arguments.of(
                        "ABC",
                        new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"},
                        "WORLD"
                )
        );
    }

    @DisplayName("조건과 일치하는 음악 제목 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 방금그곡(String m, String[] musicinfos, String result) {
        Solution sol = new Solution();
        assertThat(sol.solution(m, musicinfos)).isEqualTo(result);
    }
}
